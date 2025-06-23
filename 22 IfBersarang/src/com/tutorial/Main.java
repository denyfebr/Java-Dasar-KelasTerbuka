/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nested if atau if bersarang
        int a = 2;
        int b = 10;
        System.out.println("ini adalah awal dari program");
        if(a==5){
            if(b==10){
                System.out.println("ini adalah aksi dimana a==5 dan b==10");
            }
            else{
                System.out.println("ini adalah aksi dimana a==5 dan b!=10");
            }
        }
        else{
            System.out.println("ini adalah aksi dimana a!=5 dan b!=10");
        }
        
        System.out.println("ini adalah akhir dari program");
    }
    
}
