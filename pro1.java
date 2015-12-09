/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ippro;

/**
 *
 * @author JARVIS
 */
public class pro1 {
    public static void main(String args[]){
        int k = 1, a = 1;
        while(k<11){
            for(int i=1; i<=9-a; i++){
                System.out.print(" ");
            }
            int b = 1;
            while(b<a){
                System.out.print(""+b);
                b++;
            }
            while(b>=1){
                System.out.print(""+b);
                b--;
            }
            System.out.println("");
            k+=2; a++;
        }
        while(k>=1){
            for(int i=1; i<=9-a; i++){
                System.out.print(" ");
            }
            int b = 1;
            while(b<a){
                System.out.print(""+b);
                b++;
            }
            while(b>=1){
                System.out.print(""+b);
                b--;
            }
            System.out.println("");
            k-=2; a--;
        }
        
    }
}
