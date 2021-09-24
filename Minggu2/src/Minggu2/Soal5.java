/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;

import java.util.Scanner;

/**
 *
 * @author daffa
 */
public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata1, kata2;
        
        kata1 = input.nextLine();
        kata2 = input.nextLine();
        
        System.out.println(kata1.length() + kata2.length());
        
        if(kata1.compareTo(kata2) < kata2.compareTo(kata1)){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        System.out.println(kata1.substring(0, 1).toUpperCase() + kata1.substring(1) + ""
                + " " + kata2.substring(0, 1).toUpperCase() + kata2.substring(1));
    }
}
