/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ippro;

import java.util.Scanner;

/**
 *
 * @author JARVIS
 */
public class pascal {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int c=1;
        for(int i=0; i<=x; i++){
            c=1;
            for(int z=0; z<x-i; z++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(" "+c);
                c = c * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
