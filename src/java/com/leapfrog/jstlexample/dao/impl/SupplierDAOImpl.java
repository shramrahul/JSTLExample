/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.dao.impl;

import com.leapfrog.jstlexample.dao.SupplierDAO;
import com.leapfrog.jstlexample.dbutil.DbconnPetstore;
import com.leapfrog.jstlexample.entity.Supplier;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ShramRahul
 */
public class SupplierDAOImpl implements SupplierDAO{
    private DbconnPetstore conn  = new DbconnPetstore();
    
  @Override
    public List<Supplier> getAll() throws ClassNotFoundException, SQLException {
       List <Supplier> suppliersList= new ArrayList<>();
        conn.open();
        String sql = "SELECT * from supplier";
        ResultSet rs = conn.executeQuery(sql);
        while(rs.next()){
        Supplier s = new Supplier();
        s.setFirstName(rs.getString("fname"));
        s.setLastName(rs.getString("lname"));
        s.setEmail(rs.getString("email"));
        s.setAddress(rs.getString("address"));
        s.setPhone(rs.getString("phone"));
        s.setSupplierid(rs.getInt("supplierid"));
        s.setCityid(rs.getInt("cityid"));
        
        suppliersList.add(s);
        }
        conn.close();
        return suppliersList;
        
        
    }

    @Override
    public int Insert(Supplier s) throws ClassNotFoundException, SQLException {
     String sql = "INSERT INTO supplier(supplierid,fname,lname,email,phone,address,cityid)Values"
             + "('"+s.getSupplierid()+"','"+s.getFirstName()+"','"+s.getLastName()+"','"+s.getEmail()+"','"+s.getPhone()+"','"+s.getAddress()+"','"+s.getCityid()+"')";
     conn.open();
     int result = conn.executeUpdate(sql);
     conn.close();
     return result;
     
    }
    
    
}
