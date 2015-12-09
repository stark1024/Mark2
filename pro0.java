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
public class pro0 {
    public static void main(String args[]){
        int k = 1;
        while(k<10){
            for(int i=1; i<=10-k; i++){
                System.out.print(" ");
            }
            for(int j=1; j<=k; j++){
                System.out.print("* ");
            }
            for(int i=1; i<=10-k; i++){
                System.out.print(" ");
            }
            System.out.println("");
            k++;
        }
        while(k>=1){
            for(int i=1; i<=10-k; i++){
                System.out.print(" ");
            }
            for(int j=1; j<=k; j++){
                System.out.print("* ");
            }
            for(int i=1; i<=10-k; i++){
                System.out.print(" ");
            }
            System.out.println("");
            k--;
        }
        
    }
}
