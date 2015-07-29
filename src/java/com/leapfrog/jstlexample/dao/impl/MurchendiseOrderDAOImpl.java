/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.dao.impl;

import com.leapfrog.jstlexample.dao.MurchendiseOrderDAO;
import com.leapfrog.jstlexample.dbutil.MysqlConnection;
import com.leapfrog.jstlexample.entity.MurchendiseOrder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MurchendiseOrderDAOImpl implements MurchendiseOrderDAO{
      private MysqlConnection conn = new MysqlConnection();
     
      

    @Override
    public List<MurchendiseOrder> getAll() throws ClassNotFoundException, SQLException {
        List <MurchendiseOrder> murchenList = new ArrayList<>();
        conn.open();
        String sql = "SELECT * from murchendiseorder";
        conn.initStatement(sql);
        ResultSet rs = conn.executeQuery();
        while(rs.next()){
        MurchendiseOrder m = new MurchendiseOrder();
        m.setOrderId(rs.getInt("orderid"));
        m.setItemId(rs.getInt("orderid"));
        m.setOrderDate(rs.getString("orderdate"));
        m.setReceiveDate(rs.getString("receivedate"));
        m.setSupplierId(rs.getInt("supplierid"));
        m.setBreed(rs.getString("breed"));
        m.setSingleCost(rs.getInt("cost"));
        m.setShippingCost(rs.getInt("shippingcost"));
        m.setQuantity(rs.getInt("quantity"));
         
        murchenList.add(m);
        
        
        }
        conn.close();
        return murchenList;
  
    
    }

    @Override
    public int insert(MurchendiseOrder m) throws ClassNotFoundException, SQLException {
    String sql = "INSERT INTO murchendiseorder(orderid,itemid,orderdate,receivedate,supplierid,breed,cost,shippingcost,quantity)VALUES"
            +"('"+m.getOrderId()+"','"+m.getItemId()+"','"+m.getOrderDate()+"','"+m.getReceiveDate()+"','"+m.getSupplierId()+"','"+m.getBreed()+"','"+m.getSingleCost()+"','"+m.getShippingCost()+"','"+m.getQuantity()+"')" ;
    
            conn.open();
        int result = conn.executeUpdate();
        conn.close();
        return result;
        }
    
}
