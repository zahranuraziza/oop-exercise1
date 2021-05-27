/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.unguided4;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        
        Square square = new Square();
        square.a = 3;
        
        Rectangle rectangle = new Rectangle();
        rectangle.length = 5;
        rectangle.width = 6;
        
        Circle circle = new Circle();
        circle.radius = 7;
        
        shape.area();
        shape.circumference();
        
        square.area();
        square.circumference();
        
        rectangle.area();
        rectangle.circumference();
        
        circle.area();
        circle.circumference();
    }
    
}
