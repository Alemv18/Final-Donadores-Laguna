/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Donacion;
import models.Donador;
import models.Receptor;

/**
 *
 * @author juans
 */
public class DonacionDAO {
    private PreparedStatement statement;
    private Connection connection;
    private static final Logger logger = Logger.getLogger(DonacionDAO.class.getName());
    
    public DonacionDAO (Connection connection) {
        this.connection = connection;
    }
    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * @param connection the connection to set
     */
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Donacion donacion) {
        try { 
            statement = connection.prepareStatement("INSERT INTO donacion(id_receptor,id_donador,fecha_donacion,ubicacion,comentarios) VALUES (?,?,?,?,?)");
            synchronized(statement) {
                statement.setInt(1, donacion.getReceptor().getId());
                statement.setInt(2, donacion.getDonador().getId());
                statement.setDate(3, donacion.getFecha_donacion());
                statement.setString(4, donacion.getUbicacion());
                statement.setString(5, donacion.getComentarios());
                statement.executeUpdate();
            }
            statement.close();
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            throw new RuntimeException(sqle);
        }
    }
    
    public ArrayList<Donacion> search(String parameter, String value){
      ArrayList<Donacion> result = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM donadores WHERE ? = ?");
            synchronized(statement) {
                statement.setString(1, parameter);
                statement.setString(2, value);
            }
            ResultSet rs = statement.executeQuery();
            
            
            while (rs.next()){
                Donacion donacion = new Donacion(
                                        new Receptor(rs.getInt(1),null),
                                        new Donador(rs.getInt(2),null),
                                        rs.getInt(3),
                                        rs.getDate(4),
                                        rs.getString(5),
                                        rs.getString(6));;
                
                result.add(donacion);
            }
            
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            throw new RuntimeException(sqle);
        }
        return result;  
    }
    
    public ArrayList<Donacion> selectAll(){
    
        ArrayList<Donacion> donaciones = new ArrayList<>();
        try {
            statement = connection.prepareStatement("select receptor.nombre as nombre_receptor, donador.nombre as nombre_donador,  donacion.* from donacion inner join donador on donador.id = donacion.id_donador inner join receptor on receptor.id = donacion.id_receptor");
            ResultSet rs = statement.executeQuery();
            
            
            while (rs.next()){              
                Donacion donacion = new Donacion(new Receptor(rs.getInt("id_receptor"),rs.getString("nombre_receptor")),
                                                new Donador(rs.getInt("id_donador"), rs.getString("nombre_donador")),
                                                rs.getInt("id"),
                                                rs.getDate("fecha_donacion"),
                                                rs.getString("ubicacion"),
                                                rs.getString("comentarios"));
                                                
                donaciones.add(donacion);
            }
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            throw new RuntimeException(sqle);
        }
        logger.log(Level.INFO, donaciones.getClass().getSimpleName() + "\n" + donaciones.getClass().getName());
        return donaciones;
        

    }
       
    
}
