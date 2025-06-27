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
        System.out.println("Do While");
        
        System.out.println("awal program");
        
        int a=0;
        boolean kondisi=true;
        
        do{
            a++;
            System.out.println("nilai ke-"+a);  
            if(a==10){
                kondisi=false;
            }            
        }while(kondisi);
        System.out.println("akhir program");
    }    
}
