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
public class Student {
    // Attribute
    String name;
    int id;
    // Constructor without parameter
    public Student() {
        this.name = "Default";
        this.id = 0;
    }
    // Constructor with parameter
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
