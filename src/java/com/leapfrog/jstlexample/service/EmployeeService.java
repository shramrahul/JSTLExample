/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.service;

import com.leapfrog.jstlexample.dao.EmployeeDAO;

import com.leapfrog.jstlexample.dao.impl.EmployeeDAOImpl;
import com.leapfrog.jstlexample.entity.Employee;

import java.sql.SQLException;

import java.util.List;

/**
 *
 * @author ShramRahul
 */
public class EmployeeService {
   private EmployeeDAO employeeDAO=new EmployeeDAOImpl();
    
    public List<Employee> getAll() throws ClassNotFoundException, SQLException{
        return employeeDAO.getAll();
    }
    
    public int insert(Employee e) throws ClassNotFoundException, SQLException{
        return employeeDAO.insert(e);
        
    }
    
    
}
