/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.guided4b;

/**
 *
 * @author USER
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    public String getType() {
        return "Dog";
    }
    
    public String playSound() {
        return "Guk~!";
    }
    
}
