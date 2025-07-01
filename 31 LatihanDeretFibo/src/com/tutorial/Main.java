/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tutorial;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // menghitung nilai deret fibonacci ke-n
        int f_n,f_n_1,f_n_2,n;
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - :");
        n = inputUser.nextInt();
        
        f_n_2=0;
        f_n_1=1;
        f_n=1;
        
        for(int i=1;i<=n;i++){            
            System.out.println("nilai ke - "+i+" = "+f_n);
            f_n=f_n_1+f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
    }
    
}
