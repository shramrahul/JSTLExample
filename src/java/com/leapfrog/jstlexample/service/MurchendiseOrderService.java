/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.service;

import com.leapfrog.jstlexample.dao.MurchendiseOrderDAO;
import com.leapfrog.jstlexample.dao.impl.MurchendiseOrderDAOImpl;
import com.leapfrog.jstlexample.entity.MurchendiseOrder;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ShramRahul
 */
public class MurchendiseOrderService {
    private MurchendiseOrderDAO murchenDAO = new MurchendiseOrderDAOImpl();
   
    public List <MurchendiseOrder> getAll () throws ClassNotFoundException, SQLException{
    return murchenDAO.getAll();
    }
    
    public int insert (MurchendiseOrder m) throws ClassNotFoundException, SQLException{
    return murchenDAO.insert(m);
    }
    
}
