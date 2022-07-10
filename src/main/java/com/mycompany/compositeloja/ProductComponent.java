/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compositeloja;

/**
 *
 * @author igor_
 */
public abstract class ProductComponent {
    public static User user;
    private float price;
    private String name;
    
    public ProductComponent(String name, float price){
        this.name = name;
        this.price = price;
    }
    
    public ProductComponent(){   
    }
    
    public abstract void add(User user, ProductComponent ...products);
    public abstract void remove(ProductComponent product);
    
    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
