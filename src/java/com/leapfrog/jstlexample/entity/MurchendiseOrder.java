/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.jstlexample.entity;

/**
 *
 * @author ShramRahul
 */
public class MurchendiseOrder {
   private int orderId;
   private int itemId;
   private String orderDate;
   private String receiveDate;
   private int supplierId;
   private String breed;
   private int singleCost;
   private int shippingCost;
   private int quantity;

    public MurchendiseOrder(int orderId, int itemId, String orderDate, String receiveDate, int supplierId, String breed, int singleCost, int shippingCost, int quantity) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.orderDate = orderDate;
        this.receiveDate = receiveDate;
        this.supplierId = supplierId;
        this.breed = breed;
        this.singleCost = singleCost;
        this.shippingCost = shippingCost;
        this.quantity = quantity;
    }

    public MurchendiseOrder() {
        }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSingleCost() {
        return singleCost;
    }

    public void setSingleCost(int singleCost) {
        this.singleCost = singleCost;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   
   
   
    
}
