/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.service;

import com.leapfrog.jstlexample.dao.StudentDAO;
import com.leapfrog.jstlexample.dao.impl.StudentDAOImpl;
import com.leapfrog.jstlexample.entity.Employee;
import com.leapfrog.jstlexample.entity.Student;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author ShramRahul
 */
public class StudentService {
    
    private StudentDAO studentDAO=new StudentDAOImpl();
    
    public List<Student> getAll() throws ClassNotFoundException, SQLException{
        return studentDAO.getAll();
    }
    
    public int insert(Student s) throws ClassNotFoundException, SQLException{
        return studentDAO.insert(s);
    }
    public int update(Student s) throws ClassNotFoundException, SQLException{
        return studentDAO.update(s);
        
    }
     
      public int delete(int id) throws ClassNotFoundException, SQLException{
        return studentDAO.delete(id);
        
    }
    
}
