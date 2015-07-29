/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.dao;


import com.leapfrog.jstlexample.entity.Employee;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author ShramRahul
 */
public interface EmployeeDAO {
    public List<Employee> getAll() throws ClassNotFoundException,SQLException;
    public int insert(Employee s)throws ClassNotFoundException,SQLException;
}
