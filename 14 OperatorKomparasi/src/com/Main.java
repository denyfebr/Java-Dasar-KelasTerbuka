/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operator komparasi...ini akan menghasilkan nilai dalam bentuk boolean
        
        int a,b;
        boolean hasilKomparasi;
        
        // operator persamaan/equal
        System.out.println("||||||PERSAMAAN|||||||");
        a = 10;
        b = 10;
        hasilKomparasi = (a==b);
        
        System.out.printf("%d == %d --> %s\n",a,b,hasilKomparasi);
        
        a=11;
        hasilKomparasi = (a==b);
        System.out.printf("%d == %d --> %s\n",a,b,hasilKomparasi);
        System.out.println("");
        // operator pertidaksamaan/not equal
        System.out.println("||||||PERTIDAKSAMAAN|||||||");
        a = 10;
        b = 10;
        hasilKomparasi = (a!=b);
        
        System.out.printf("%d != %d --> %s\n",a,b,hasilKomparasi);
        
        a=11;
        hasilKomparasi = (a!=b);
        System.out.printf("%d != %d --> %s\n",a,b,hasilKomparasi);
        System.out.println("");
        // operator kurang dari/less than
        System.out.println("||||||KURANG DARI|||||||");
        a = 9;
        b = 10;
        hasilKomparasi = (a<b);
        
        System.out.printf("%d < %d --> %s\n",a,b,hasilKomparasi);
        
        a=11;
        hasilKomparasi = (a<b);
        System.out.printf("%d < %d --> %s\n",a,b,hasilKomparasi);
        
        b=11;
        hasilKomparasi = (a<b);
        System.out.printf("%d < %d --> %s\n",a,b,hasilKomparasi);
        
        System.out.println("");
        // operator lebih besar dari/grater than
        System.out.println("||||||LEBIH BESAR DARI|||||||");
        a = 9;
        b = 10;
        hasilKomparasi = (a>b);
        
        System.out.printf("%d > %d --> %s\n",a,b,hasilKomparasi);
        
        a=11;
        hasilKomparasi = (a>b);
        System.out.printf("%d > %d --> %s\n",a,b,hasilKomparasi);
        
        b=11;
        hasilKomparasi = (a>b);
        System.out.printf("%d > %d --> %s\n",a,b,hasilKomparasi);
        System.out.println("");
        
        System.out.println("");
        // operator kurang dari sama dengan/less than equal
        System.out.println("||||||KURANG DARI SAMA DENGAN|||||||");
        a = 9;
        b = 10;
        hasilKomparasi = (a<=b);
        
        System.out.printf("%d <= %d --> %s\n",a,b,hasilKomparasi);
        
        a=11;
        hasilKomparasi = (a<=b);
        System.out.printf("%d <= %d --> %s\n",a,b,hasilKomparasi);
        
        b=11;
        hasilKomparasi = (a<=b);
        System.out.printf("%d <= %d --> %s\n",a,b,hasilKomparasi);
        
        System.out.println("");
         // operator lebih besar dari sama dengan/greater than equal
        System.out.println("||||||LEBIH BESAR DARI SAMA DENGAN|||||||");
        a = 9;
        b = 10;
        hasilKomparasi = (a>=b);
        
        System.out.printf("%d >= %d --> %s\n",a,b,hasilKomparasi);
        
        a=11;
        hasilKomparasi = (a>=b);
        System.out.printf("%d >= %d --> %s\n",a,b,hasilKomparasi);
        
        b=11;
        hasilKomparasi = (a>=b);
        System.out.printf("%d >= %d --> %s\n",a,b,hasilKomparasi);
    }
    
}
