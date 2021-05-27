/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.unguided5;
public class Main {
    public static void main(String[] args) {
     Shape shape = new Shape();
        Square square = new Square(4);
        Circle circle = new Circle(50);
        Recatangle rectangle = new Recatangle(6,5);
        
        // memanggil method luas dan keliling
        shape.area();
        shape.circumference();
        
        System.out.println("Area of square: " + square.area());
        System.out.println("Circumference of square: " + square.circumference());
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Circumference of circle: " + circle.circumference());
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Circumference of rectangle: " + rectangle.circumference());
   
    }
}
