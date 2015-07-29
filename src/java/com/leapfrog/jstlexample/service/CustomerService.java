/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.service;

import com.leapfrog.jstlexample.dao.CustomerDAO;
import com.leapfrog.jstlexample.dao.impl.CustomerDAOImpl;
import com.leapfrog.jstlexample.entity.Customer;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ShramRahul
 */
public class CustomerService {
    private CustomerDAO customersDAO = new CustomerDAOImpl();
    
    public List<Customer> getall() throws ClassNotFoundException , SQLException{
    return customersDAO.getAll();
}
    public int insert(Customer c) throws ClassNotFoundException, SQLException{
    return customersDAO.insert(c);
    
    }
    
    
    
    
    
}
