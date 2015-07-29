/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.leapfrog.jstlexample.dao.impl;

import com.leapfrog.jstlexample.dao.EmployeeDAO;
import com.leapfrog.jstlexample.dbutil.MysqlConnection;
import com.leapfrog.jstlexample.entity.Employee;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;



public class EmployeeDAOImpl implements EmployeeDAO{
    private MysqlConnection conn = new MysqlConnection();
   
    @Override
    public List<Employee> getAll() throws ClassNotFoundException, SQLException {
    List<Employee> employeeList=new ArrayList <>();
        conn.open();
        String sql ="SELECT * from employee";
        PreparedStatement stmt = conn.initStatement(sql);
        ResultSet rs = conn.executeQuery();
        
        while(rs.next()){
         Employee s = new Employee();
         s.setAddress(rs.getString("address"));
         s.setCityid(rs.getInt("cityid"));
         s.setContactNo("phone");
         s.setEid(rs.getInt("empid"));
         s.setEmail(rs.getString("email"));
         s.setFirstName(rs.getString("fname"));
         s.setLastName(rs.getString("lname"));
         s.setSalary(rs.getInt("salary"));
         s.setPost(rs.getString("post"));
         
         employeeList.add(s);
         }
        conn.close();
        return employeeList;
    }

    @Override
    public int insert(Employee s) throws ClassNotFoundException, SQLException {
         String sql = "INSERT INTO employee(empid,fname,lname, email ,post,salary,phone,address) VALUES"
            + "('"+s.getEid()+"','"+s.getFirstName()+"','"+s.getLastName()+"','"+s.getEmail()+"','"+s.getPost()+"','"+s.getSalary()+"','"+s.getContactNo()+"','"+s.getAddress()+"')";
         
    
            
           conn.open();
        int result = conn.executeUpdate();
        conn.close();
        return result;
    }
    
    
    
}
