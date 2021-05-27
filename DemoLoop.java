/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.guided1;

/**
 *
 * @author USER
 */
public class DemoLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //For loop
        for(int i=1; i<=5; i++)
        System.out.println("For loop (" + i + "/5)");
        System.out.println();

        //While loop
        int j=1;
        while(j<=5) {
            System.out.println("While loop (" + j + "/5)");
            j++;
        }
        System.out.println();

         //Do-While loop
        int k=1;
        do {
            System.out.println("D0-while loop (" + k + "/5)");
            k++;
        }while(k<=5);
            System.out.println();

        //Break demo
        int x=0;
        while(x<999999) {
            System.out.println("Looping...(" + x + "/999999)");
            x++;

            if(x==5) {
                System.out.println("Finished!");
            break;
            }
        }
    }
    
}
