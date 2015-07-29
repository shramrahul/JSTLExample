/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.dao;

import com.leapfrog.jstlexample.entity.Student;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author ShramRahul
 */
public interface StudentDAO {
    public List<Student> getAll() throws ClassNotFoundException,SQLException;
    public int insert(Student s)throws ClassNotFoundException,SQLException;

    public int update(Student e)throws ClassNotFoundException,SQLException;

    public int delete(int id)throws ClassNotFoundException,SQLException;
    
}
