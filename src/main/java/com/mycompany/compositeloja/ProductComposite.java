/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compositeloja;

import java.util.ArrayList;


/**
 *
 * @author igor_
 */
public class ProductComposite extends ProductComponent {
    private ArrayList<ProductComponent> children = new ArrayList<>();
    
    @Override
    public void add(ProductComponent ...products) {
        for(ProductComponent product:products){
            this.children.add(product);
        }
    }

    @Override
    public void remove(ProductComponent product) {
        int productIndex = children.indexOf(product);
        if (productIndex != -1){
            children.remove(product);
        }
    }

    @Override
        public float getPrice() {
        float sum = 0;
        sum = children.stream().map(product -> product.getPrice()).reduce(sum, (accumulator, _item) -> accumulator + _item);
        return sum;
    }
}
