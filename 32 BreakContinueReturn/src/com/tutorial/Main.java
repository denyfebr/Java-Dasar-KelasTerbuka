/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // break, continue, dan return
        
        int a = 0;
        
        while(true){            
            a++;            
            if(a==10){
                break; // ini adalah keyword untuk memaksa dari loop
            }
            else if (a==5){
                continue; // ini adalah keyword untuk memaksa memulai aksi dari awal
            }else if(a==7){
                return;
            }
            
            // return // memaksa keluar dari seluruh looping
            System.out.println("looping ke - "+a);
        }
        
        System.out.println("akhir dari looping");
    }
}
