/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.dbutil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ShramRahul
 */
public class DbConnection {
    private Connection connection=null;
    private Statement stmt=null;
    
    public void open() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "");
        
    }
    
    public int executeUpdate(String sql) throws SQLException{
      stmt=connection.createStatement();
      return stmt.executeUpdate(sql);
        
    }
    
    public ResultSet executeQuery(String sql) throws SQLException{
        stmt=connection.createStatement();
        return stmt.executeQuery(sql);
        
    }
    public void close() throws SQLException{
        
        if(connection!=null && !connection.isClosed()){
            connection.close();
            connection=null;
        }
        
    }
    
}
