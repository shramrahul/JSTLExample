/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.dao.impl;

import com.leapfrog.jstlexample.dao.AnimalDAO;
import com.leapfrog.jstlexample.dbutil.MysqlConnection;
import com.leapfrog.jstlexample.entity.Animal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ShramRahul
 */
public class AnimalDAOImpl implements AnimalDAO{
     private MysqlConnection  conn;

    public AnimalDAOImpl() {
        this.conn = new MysqlConnection();
    }
   
     

    @Override
    public List<Animal> getAll() throws ClassNotFoundException, SQLException {
          List<Animal> animalsList =new ArrayList<>();
         
             conn.open();
             String sql = "SELECT * from animal";
             conn.initStatement(sql);
             ResultSet rs= conn.executeQuery();
             while(rs.next()){
                 Animal a= new Animal();
                 a.setAnimalid(rs.getInt("animalid"));
                 a.setBreed(rs.getString("breed"));
                 a.setCategory(rs.getString("category"));
                 a.setColor(rs.getString("color"));
                 a.setGender(rs.getString("gender"));
                 a.setPrice(rs.getString("price"));

                 animalsList.add(a);
             }
             conn.close();
             return animalsList;
    }

    @Override
    public int insert(Animal a) throws ClassNotFoundException, SQLException {
       
             String sql = "INSERT INTO animal (animalid,category,breed,gender,color,price)Values"
                     + "('"+a.getAnimalid()+"','"+a.getCategory()+"','"+a.getBreed()+"','"+a.getGender()+"',,'"+a.getPrice()+"')";
             conn.open();
             int result = conn.executeUpdate();
             conn.close();
            
         
    return result;
    }
    
}
