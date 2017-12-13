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
import servlets.login;

/**
 *
 * @author juans
 */
public class UserDAO {
    
     private PreparedStatement statement;
    private Connection connection;
    private static final Logger logger = Logger.getLogger(DonadorDAO.class.getName());
    
    public UserDAO (Connection connection) {
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
    
    public Boolean search(String usuario, String password){
    
        try {
            statement = connection.prepareStatement("SELECT * FROM usuario WHERE usuario = ?");
            synchronized(statement) {
                statement.setString(1, usuario);
            }
            
            ResultSet rs = statement.executeQuery();
            login.message="Usuario no encontrado";
            
            while(rs.next()){

                String u = rs.getString("usuario");
                String p = rs.getString("clave");

                if (!(u.isEmpty()) && u != null){
                    if (password.equals(rs.getString("clave"))){
                        login.message = "Ingreso Exitoso";
                        return true;


                    }
                    else{
                        login.message = "Contraseña no valida";
                    }
                }
                else {
                    login.message = "Usuario no existente";
                }
            }
            
            
            
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE, sqle.toString(), sqle);
            login.message = "Usuario no existente";
        }
        return false;  
    }
    
}
