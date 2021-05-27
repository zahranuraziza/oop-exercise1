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
public class Main1 {
    public static void main(String[] args) {
        // Object constructor
        Animal animal = new Animal("An animal");
        Cat cat = new Cat("Lucas");
        Dog dog = new Dog("Sebastian");
        Rabbit rabbit = new Rabbit("Mina");
 
        // Outputs
        animal.showProfile();
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
    }
    
}
