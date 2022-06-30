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
    
    public abstract void add(ProductComponent ...products);
    public abstract void remove(ProductComponent product);
    public abstract float getPrice();
}
