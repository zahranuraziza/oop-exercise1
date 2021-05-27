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
public class Recatangle {
    int length, width;
    
    public Recatangle(int length, int width){
        this.length = length;
        this.width = width;
    }  
    
    public float area(){
        return this.length * this.width;
    }
    
    public float circumference(){
        return (this.length + this.width)*2;
    }
}
