/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.unguided2;


import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input birth year: ");
        int birthYear = input.nextInt();
        
        System.out.print("Input current year: ");
        int currentYear = input.nextInt();
       
        unguided2 Calculate;
        Calculate = new unguided2(birthYear,currentYear);
        
        System.out.print("Your age: ");
        Calculate.calculte();
    }
    
}
