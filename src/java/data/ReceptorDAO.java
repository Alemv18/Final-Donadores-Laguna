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
import models.Donador;
import models.Receptor;
import servlets.RegistroReceptorServlet;

/**
 *
 * @author juans
 */
public class ReceptorDAO {
    
     private PreparedStatement statement;
    private Connection connection;
    private static final Logger logger = Logger.getLogger(ReceptorDAO.class.getName());
    
    public ReceptorDAO (Connection connection) {
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
    
    public void insert(Receptor receptor) {
        try { 
            statement = connection.prepareStatement("INSERT INTO receptor(nombre,apellidos,fecha_nacimiento,sexo,sangre,diagnostico,ubicacion) VALUES (?,?,?,?,?,?,?)");
            synchronized(statement) {
                statement.setString(1, receptor.getNombre());
                statement.setString(2, receptor.getApellidos());
                statement.setDate(3, receptor.getFecha_nacimiento());
                statement.setString(4, receptor.getSexo());
                statement.setString(5, receptor.getSangre());
                statement.setString(6, receptor.getDiagnostico());
                statement.setString(7, receptor.getUbicacion());
                statement.executeUpdate();
            }
            statement.close();
            
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            RegistroReceptorServlet.message = "Error agregando receptor";
            
        }
    }
    
    public ArrayList<Receptor> search(String parameter, String value){
      ArrayList<Receptor> result = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM receptor WHERE ? = ?");
            synchronized(statement) {
                statement.setString(1, parameter);
                statement.setString(2, value);
            }
            ResultSet rs = statement.executeQuery();
            
            
            while (rs.next()){
                Receptor receptor = new Receptor(
                                        rs.getString(1),
                                        rs.getString(2),
                                        rs.getDate(3),
                                        rs.getString(4),
                                        rs.getString(5),
                                        rs.getString(6),
                                        rs.getString(7));
                                                   
                result.add(receptor);
            }
            
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            throw new RuntimeException(sqle);
        }
        return result;  
    }
    
    public ArrayList<Receptor> selectAll(){
    
        ArrayList<Receptor> receptores = new ArrayList<>();
        try {
            statement = connection.prepareStatement("SELECT * FROM receptor");
            ResultSet rs = statement.executeQuery();
            
            
            while (rs.next()){              
                Receptor receptor = new Receptor(rs.getInt("id"),rs.getString("nombre"),rs.getString("apellidos"),rs.getDate("fecha_nacimiento"),rs.getString("sexo"),rs.getString("sangre"),rs.getString("diagnostico"), rs.getString("ubicacion"));           
                receptores.add(receptor);
            }
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            throw new RuntimeException(sqle);
        }
        logger.log(Level.INFO, receptores.getClass().getSimpleName() + "\n" + receptores.getClass().getName());
        return receptores;
        

    }
    
}
