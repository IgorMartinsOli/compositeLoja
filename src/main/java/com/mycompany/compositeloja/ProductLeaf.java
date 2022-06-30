/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compositeloja;

/**
 *
 * @author igor_
 */
public class ProductLeaf extends ProductComponent{
    public ProductLeaf(String name, float price){
        super();
    }
    
    @Override
    public float getPrice() {
        return this.getPrice();
    }

    @Override
    public void add(ProductComponent ...products) {
        System.out.println("Isso fere a segregação da interface");
    }

    @Override
    public void remove(ProductComponent product) {
        System.out.println("Isso fere a segregação da interface");
    }

    
}
