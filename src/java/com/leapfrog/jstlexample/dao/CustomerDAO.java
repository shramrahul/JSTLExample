/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.dao;

import com.leapfrog.jstlexample.entity.Customer;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ShramRahul
 */
public interface CustomerDAO {
    public List<Customer> getAll()throws ClassNotFoundException , SQLException;
    public int insert(Customer c)throws ClassNotFoundException,SQLException;
    
    
    
}
