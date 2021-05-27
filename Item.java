/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.guided3;

/**
 *
 * @author USER
 */
public class Item {
   private String name;
   private int price;
   private String type;
   
   public Item(String name, int price, String type) {
    this.name = name;
    this.price = price;
    this.type = type;
   }
    
   public String getName() {
    return name;
    }
 
   public int getPrice() {
    return price;
    }
    
   public String getType() {
    return type;
    }
 
   public void showDetail() {
        System.out.println("- " + getName() + " (" + getType() + " ) - Rp " + getPrice());
    }
}
