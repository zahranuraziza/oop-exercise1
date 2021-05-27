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
public class Main2 {
    public static void main(String[] args) {
        // Array of objects of inherited classes
        Animal[] animals = {
            new Cat("Cat1"),
            new Dog("Dog1"),
            new Rabbit("Rabbit1"),
        };
 
        // Output first way
        int animalCount = animals.length;
        for (int i = 0; i < animalCount; i++)
            animals[0].showProfile();
 
        // Output second way
        for (Animal animal : animals)
            animal.showProfile();

    }
    
}
