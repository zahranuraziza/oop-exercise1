/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.guided5;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
       Chef chef = new Chef("Lily");
       
       Chef.cook();
       Chef.cook("Beef Steak");
    }
    
}
