/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.unguided1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class unguided1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();

        if(0 == num %2)
        System.out.println(num + " is even number");
        else 
        System.out.println(num + " is odd number");
    }
    
}
