/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahra.unguided3;

/**
 *
 * @author USER
 */
public class Game {
   public static void main(String[] args){

        // membuat objek player
        Player permainan = new Player();

        // mengisi atribut player
        permainan.name = "Zahra";
        permainan.speed = 80;
        permainan.healthPoin = 100;

        // menjalankan method
        permainan.run();

        if(permainan.isDead()){
            System.out.println("Game Over!");
        }
   }
 
}
