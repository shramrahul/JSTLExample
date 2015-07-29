/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.service;

import com.leapfrog.jstlexample.dao.SupplierDAO;
import com.leapfrog.jstlexample.dao.impl.SupplierDAOImpl;
import com.leapfrog.jstlexample.entity.Supplier;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ShramRahul
 */
public class SupplierService {
    private SupplierDAO suppliersDAO  = new SupplierDAOImpl();
    
    public List <Supplier> getAll () throws ClassNotFoundException, SQLException{
    return suppliersDAO.getAll();
    
    }
    
    public int insert (Supplier s) throws ClassNotFoundException, SQLException{
    return suppliersDAO.Insert(s);
    
    
    }
    
    
}
