/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compositeloja;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author igor_
 */
public class ProductComposite extends ProductComponent {
    private final ArrayList<ProductComponent> children = new ArrayList<>();

    public ProductComposite(){   
    }
    
    public ProductComposite(String name, float price) {
        super(name, price);
    }
    
    @Override
    public void add(User user, ProductComponent ...products) {
        switch(user.getType()){
            case 1 -> {
                if(children.size() + products.length <= 3){
                    this.children.addAll(Arrays.asList(products));
                }else{
                    System.out.println("Carrinho cheio!!!!!!!!!!!!!!");
                }
            }
            case 2 -> {
                if(children.size() + products.length <= 5){
                    this.children.addAll(Arrays.asList(products));
                }else{
                    System.out.println("Carrinho cheio!!!!!!!!!!!!!!");
                }
            }
            case 3 -> {
                if(children.size() + products.length <= 10){
                    this.children.addAll(Arrays.asList(products));
                }else{
                    System.out.println("Carrinho cheio!!!!!!!!!!!!!!");
                }
            }
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
        sum = children.stream().map((ProductComponent child) -> {
            System.out.println("Item: "+child.getName()+", valor: "+child.getPrice());
            return child;
        }).map(child -> child.getPrice()).reduce(sum, (accumulator, _item) -> accumulator + _item);
        return sum;
    }
}
