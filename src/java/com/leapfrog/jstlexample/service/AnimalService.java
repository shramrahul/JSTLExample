/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.service;

import com.leapfrog.jstlexample.dao.AnimalDAO;
import com.leapfrog.jstlexample.dao.impl.AnimalDAOImpl;
import com.leapfrog.jstlexample.entity.Animal;
import com.leapfrog.jstlexample.entity.Customer;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ShramRahul
 */
public class AnimalService {
    private AnimalDAO animalsDAO = new AnimalDAOImpl();
    
    public List <Animal> getAll() throws Exception{
       
    return animalsDAO.getAll();
        
    }
    
    public int insert (Animal a) throws ClassNotFoundException, SQLException{
        return animalsDAO.insert(a);
        
    }
    
}
