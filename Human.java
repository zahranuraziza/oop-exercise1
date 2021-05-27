/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.guided2;

/**
 *
 * @author USER
 */
public class Human {
    private String name;
    private int age;
 
    // First: Default constructor without parameter
    public Human() {}
 
    // Second constructor
    public Human(String name) {
        this.name = name;
    }

    // Third constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    // Method Defition
    public String getName() {
        return name;
      }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }

}
