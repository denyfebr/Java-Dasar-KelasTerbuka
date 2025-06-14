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
        // Tipe data primitive (nilai ukurannya fix sudah ditetapan di JAVA)
        // integer, byte, short, long, double, float, char, boolean
        
        // integer (satuan)
        int i = 10; //
        System.out.println("=====INTEGER=======");
        System.out.printf("nilai integer i = %d\n",i);
        System.out.println("Nilai max integer = "+Integer.MAX_VALUE);
        System.out.println("Nilai min integer = "+Integer.MIN_VALUE);
        System.out.println("Besar integer = "+Integer.BYTES + " Bytes");
        System.out.println("Besar integer = "+Integer.SIZE + " Bit");
        System.out.println("");
        // byte (satuan)
        byte b = 10; //
        System.out.println("=====BYTE=======");
        System.out.println("nilai byte b = "+b);
        System.out.println("Nilai max byte = "+Byte.MAX_VALUE);
        System.out.println("Nilai min byte = "+Byte.MIN_VALUE);
        System.out.println("Besar byte = "+Byte.BYTES + " Bytes");
        System.out.println("Besar byte = "+Byte.SIZE + " Bit");
        System.out.println("");
        // short (satuan)
        short s = 10; //
        System.out.println("=====SHORT=======");
        System.out.println("nilai short s = "+s);
        System.out.println("Nilai max short = "+Short.MAX_VALUE);
        System.out.println("Nilai min short = "+Short.MIN_VALUE);
        System.out.println("Besar short = "+Short.BYTES + " Bytes");
        System.out.println("Besar short = "+Short.SIZE + " Bit");
        System.out.println("");
        // long (satuan)
        long l = 10L; //
        System.out.println("=====LONG=======");
        System.out.println("nilai long l = "+l);
        System.out.println("Nilai max long = "+Long.MAX_VALUE);
        System.out.println("Nilai min long = "+Long.MIN_VALUE);
        System.out.println("Besar long = "+Long.BYTES + " Bytes");
        System.out.println("Besar long = "+Long.SIZE + " Bit");
        System.out.println("");
        
        // double (decimal)
        double d = 10.5d; //
        System.out.println("=====DOUBLE=======");
        System.out.println("nilai long d = "+d);
        System.out.println("Nilai max double = "+Double.MAX_VALUE);
        System.out.println("Nilai min double = "+Double.MIN_VALUE);
        System.out.println("Besar double = "+Double.BYTES + " Bytes");
        System.out.println("Besar double = "+Double.SIZE + " Bit");
        System.out.println("");
        
        // float (decimal)
        float f = 10.5f; //
        System.out.println("=====FLOAT=======");
        System.out.println("nilai float f = "+f);
        System.out.println("Nilai max float = "+Float.MAX_VALUE);
        System.out.println("Nilai min float = "+Float.MIN_VALUE);
        System.out.println("Besar float = "+Float.BYTES + " Bytes");
        System.out.println("Besar float = "+Float.SIZE + " Bit");
        System.out.println("");
        
        char c = 'c'; // berdasarkan ASCII
        System.out.println("=====CHAR=======");
        System.out.println("nilai char c = "+c);
        System.out.println("Nilai max char = "+Character.MAX_VALUE);
        System.out.println("Nilai min char = "+Character.MIN_VALUE);
        System.out.println("Besar char = "+Character.BYTES + " Bytes");
        System.out.println("Besar char = "+Character.SIZE + " Bit");
        System.out.println("");
        
        boolean bool = true; // berdasarkan Bool
        System.out.println("=====BOOLEAN=======");
        System.out.println("nilai boolean bool = "+bool);        
        System.out.println("Nilai boolean true = "+Boolean.TRUE);
        System.out.println("Nilai boolean false = "+Boolean.FALSE);
        System.out.println("");
    }    
}
