/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.dao.impl;

import com.leapfrog.jstlexample.dao.StudentDAO;
import com.leapfrog.jstlexample.dbutil.DbConnection;
import com.leapfrog.jstlexample.entity.Student;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author ShramRahul
 */
public class StudentDAOImpl implements StudentDAO{
    private DbConnection conn= new DbConnection();
    @Override
    public List<Student> getAll() throws ClassNotFoundException, SQLException {
       List<Student> studentList=new ArrayList<Student>();
       conn.open();
       String sql="SELECT * from tbl_students";
       ResultSet rs = conn.executeQuery(sql);
       while (rs.next()){
           Student s = new Student ();
           s.setId(rs.getInt("id"));
           s.setFirstName(rs.getString("first_name"));
           s.setLastName(rs.getString("last_name"));
           s.setEmail(rs.getString("email"));
           s.setContactNo(rs.getString("contact_no"));
           s.setStatus(rs.getBoolean("status"));
           
           studentList.add(s);
           
       }
       conn.close();
       
       
       
        return studentList;
        
    }

    @Override
    public int insert(Student s) throws ClassNotFoundException, SQLException {
    String sql = "INSERT INTO tbl_students(first_name,last_name, email ,contact_no,status) VALUES"
            + "('"+s.getFirstName()+"','"+s.getLastName()+"','"+s.getEmail()+"','"+s.getContactNo()+"',"+s.getStatus()+")";
    
        conn.open();
        int result = conn.executeUpdate(sql);
        conn.close();
        return result;
        
    }

    @Override
    public int update(Student e) throws ClassNotFoundException, SQLException {
        int status=(e.getStatus())?1:0;
        
        String sql= "UPDATE tbl_students SET first_name='"+e.getFirstName()+"',last_name='"+e.getLastName()+"',email='"+e.getEmail()+"',contact_no='"+e.getContactNo()+"',status="+status+" WHERE id=" + e.getId();
        System.out.println(sql);      
        conn.open();
        int result= conn.executeUpdate(sql);
        conn.close();
      
        return result; }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        String sql= "DELETE FROM tbl_students WHERE id="+id;
        System.out.println(sql);      
        conn.open();
        int result= conn.executeUpdate(sql);
        conn.close();
      
        return result;}
    
}
