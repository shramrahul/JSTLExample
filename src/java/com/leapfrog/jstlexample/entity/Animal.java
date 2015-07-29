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
public class Animal {
    private int animalid;
    private String category;
    private String breed;
    private String gender;
    private String color ;
    private String price;

    public Animal(int animalid, String category, String breed, String gender, String color, String price) {
        this.animalid = animalid;
        this.category = category;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.price = price;
    }

    public Animal() {
        }

    public int getAnimalid() {
        return animalid;
    }

    public void setAnimalid(int animalid) {
        this.animalid = animalid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
