package com.tictactoe.database;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseManager {
    public Connection connection;
    public Statement statement;
    public PreparedStatement preparedStatement;
    public String query;
    public ResultSet resultSet; // used for store data from database    
    static final String DB_URL = "jdbc:mysql://localhost:3306/tictactoe";
//    static final String DB_DRV = "com.mysql.jdbc.Driver";
    static final String DB_DRV = "com.mysql.cj.jdbc.Driver";
    static final String DB_USER = "root";
    static final String DB_PASSWD = "123456";
    
    public DatabaseManager(){
        startConnection();
    }

    private void startConnection() {
        try {
            Class.forName(DB_DRV);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void endConnection() {
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
