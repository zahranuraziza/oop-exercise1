/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.unguided5;

/**
 *
 * @author USER
 */
public class Square {
    int sisi;
    
    public Square(int sisi) {
        this.sisi = sisi;
    }
    
    //@Override
    public float area() {
        return this.sisi * this.sisi;
    }
    
    //@Override
    public float circumference(){
        return this.sisi * 4;
    }
}
