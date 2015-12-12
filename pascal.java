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
        int[] a = new int[x];
        int[] b = new int[x+1];
        for(int i=1; i<=x; i++){
            if(i==1){
                a[0] = 1;
                for(int z=0; z<x-i+1; z++){
                    System.out.print(" ");
                }
                System.out.print(""+a[0]);
            }else{
                for(int k=0; k<i; k++){
                    a[k] = b[k];
                }
            }
            for(int j=0; j<=i; j++){
                if(j==0){
                   b[j] = a[j];
                }
                else if(j==i){
                    b[j] = a[j-1];
                } else
                    b[j] = a[j]+a[j-1];
            }
            System.out.print("\n");
            for(int z=0; z<x-i; z++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(b[k]+" ");
            }
        }
    }
}
