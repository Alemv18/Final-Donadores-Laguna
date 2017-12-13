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

/**
 *
 * @author juans
 */
public class DonadorDAO {
    
    private PreparedStatement statement;
    private Connection connection;
    private static final Logger logger = Logger.getLogger(DonadorDAO.class.getName());
    
    public DonadorDAO (Connection connection) {
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
    
    public void insert(Donador donador) {
        try { 
            statement = connection.prepareStatement("INSERT INTO donador(nombre,apellidos,fecha_nacimiento,sexo,sangre,email,telefono,direccion,cp) VALUES (?,?,?,?,?,?,?,?,?)");
            synchronized(statement) {
                statement.setString(1, donador.getNombre());
                statement.setString(2, donador.getApellidos());
                statement.setDate(3, donador.getFecha_nacimiento());
                statement.setString(4, donador.getSexo());
                statement.setString(5, donador.getSangre());
                statement.setString(6, donador.getEmail());
                statement.setString(7, donador.getTelefono());
                statement.setString(8, donador.getDireccion());
                statement.setInt(9, donador.getCp());
                statement.executeUpdate();
            }
            statement.close();
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            throw new RuntimeException(sqle);
        }
    }
    
    public ArrayList<Donador> search(String parameter, String value){
      ArrayList<Donador> result = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM donador WHERE ? = ?");
            synchronized(statement) {
                statement.setString(1, parameter);
                statement.setString(2, value);
            }
            ResultSet rs = statement.executeQuery();
            
            String firstName = "";
            String lastName = "";
            String area = "";
            
            while (rs.next()){
                Donador donador = new Donador(
                                        rs.getString(1),
                                        rs.getString(2),
                                        rs.getDate(3),
                                        rs.getString(4),
                                        rs.getString(5),
                                        rs.getString(6),
                                        rs.getString(7),
                                        rs.getString(8),
                                        rs.getInt(9));
                
                result.add(donador);
            }
            
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            throw new RuntimeException(sqle);
        }
        return result;  
    }
    
    public ArrayList<Donador> selectAll(){
    
        ArrayList<Donador> donadores = new ArrayList<>();
        try {
            statement = connection.prepareStatement("SELECT * FROM donador");
            ResultSet rs = statement.executeQuery();
            
            
            while (rs.next()){              
                Donador donador = new Donador(rs.getString("nombre"),rs.getString("apellidos"),rs.getDate("fecha_nacimiento"),rs.getString("sexo"),rs.getString("sangre"),rs.getString("email"),rs.getString("telefono"),rs.getString("direccion"), rs.getInt("cp"));           
                donador.setId(rs.getInt("id"));
                donadores.add(donador);
            }
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            throw new RuntimeException(sqle);
        }
        logger.log(Level.INFO, donadores.getClass().getSimpleName() + "\n" + donadores.getClass().getName());
        return donadores;
        

    }
    
   
    
}
