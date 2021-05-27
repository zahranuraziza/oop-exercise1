/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.guided4a;

/**
 *
 * @author USER
 */
public class Parent {
    public String name = "";
    
    public void talk() {
    if (name.equals(""))
        System.out.println("Hi!");
    else
        System.out.println("My name is " + name);
    }
}
