
package com.leapfrog.jstlexample.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class MysqlConnection {
    private Connection connection;
    private PreparedStatement stmt;
    
    
     public void open() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/petstoredb", "root", "");
        }
    
     
     public PreparedStatement initStatement(String sql) throws SQLException{
         stmt = connection.prepareStatement(sql);
         
         return stmt;
        
     }
     public int executeUpdate() throws SQLException{ 
      return stmt.executeUpdate();
        
    }
    
    public ResultSet executeQuery() throws SQLException{
        return stmt.executeQuery();
        
    }
    public void close() throws SQLException{
        
        if(connection!=null && !connection.isClosed()){
            connection.close();
            connection=null;
        }
        
    }
    
}
