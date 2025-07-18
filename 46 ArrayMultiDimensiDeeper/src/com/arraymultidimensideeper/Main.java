/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arraymultidimensideeper;
import java.util.Arrays;
/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        int[][] array_2D = {
            {1,2,3},
            {4,5,6}
        };
        
        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);
        System.out.println(Arrays.deepToString(array_2D));
        System.out.println("");
        
        char[] array_char1 = {'a','b','c'};
        char[] array_char2 = {'d','e'};
        
        char[][] arrayChar_2D = {
            array_char1,
            array_char2
        };
        
        System.out.println(arrayChar_2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
        System.out.println(Arrays.toString(arrayChar_2D));
        System.out.println(Arrays.deepToString(arrayChar_2D));
    }
}
