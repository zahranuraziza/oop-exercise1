/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.guided1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DemoScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==> Edit Profile <==");
        System.out.println();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your nickname ");
        char nickname = input.nextLine().charAt(0);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your height: ");
        float height = input.nextFloat();

        System.out.println();
        System.out.println("==> My Profile <==");
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Nickname : " + nickname);
        System.out.println("Age : " + age + "year");
        System.out.println("Height : " + height + "cm"); 
    }
    
}
