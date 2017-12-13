/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juans
 */
public class DBConnection {
    
    private Connection connection = null;
    private static final Logger logger = Logger.getLogger(DBConnection.class.getName());
    
    public DBConnection() {
        try {
           
            //MySQL DB
            String host = "localhost";
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host + ":8889/donadores_lag",
                    user = "root",
                    password = "root";
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connected to DB.");
            }
        }
        catch (SQLException sqle) {
            logger.log(Level.SEVERE,sqle.toString(),sqle);
            throw new RuntimeException(sqle);
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, e.toString(), e);
        }
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
    
}
