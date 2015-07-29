/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.dao.impl;

import com.leapfrog.jstlexample.dao.CustomerDAO;
import com.leapfrog.jstlexample.dbutil.DbconnPetstore;
import com.leapfrog.jstlexample.dbutil.MysqlConnection;
import com.leapfrog.jstlexample.entity.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShramRahul
 */
public class CustomerDAOImpl implements CustomerDAO{
    
    private MysqlConnection  conn = new MysqlConnection();
    

   
    public List<Customer> getall(){
        List<Customer> customersList= new ArrayList<>();
        try {
            conn.open();
            String sql = "SELECT * from customer"; 
            ResultSet rs= conn.executeQuery();
            while (rs.next()){
                Customer c= new Customer();
                c.setAddress(rs.getString("address"));
                c.setFirstName(rs.getString("fname"));
                c.setLastName(rs.getString("lname"));
                c.setPhone(rs.getString("phone"));
                c.setId(rs.getInt("cid"));
                c.setEmail(rs.getString("email"));
                c.setCityid(rs.getInt("cityid"));
                customersList.add(c);
                
                
                
                
            
            }
            conn.close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
            return customersList;
     
     
    }

    @Override
    public int insert(Customer c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
