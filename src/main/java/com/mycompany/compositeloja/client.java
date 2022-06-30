/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.compositeloja;
/**
 *
 * @author igor_
 */
public class client {
    public static void main(String[] args) {
        User user = new User("igor", 1);
        ProductLeaf pen = new ProductLeaf("pen", 12);
        ProductLeaf smartphone = new ProductLeaf("smartphone", 1000);
        ProductLeaf tShirt = new ProductLeaf("tShirt", 55);
        ProductComposite productBox = new ProductComposite();
        productBox.add(pen, smartphone, tShirt);
        System.out.println(productBox.getPrice());
    }
    
}
