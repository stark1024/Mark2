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
public class Rank {
    public static void main(String args[]){
        System.out.print("This program is only for words with NON-REPEATED letters\n");
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        s1 = s1.toUpperCase();
        
        //User Array
        char[] a = new char[s1.length()];
        for(int j=0; j<s1.length(); j++){
            a[j] = s1.charAt(j);
        }
        
        //Order series
        int[] i = new int[s1.length()];
        for(int j=0; j<s1.length(); j++){
            i[j] = a[j]-64;
        }
        
        //KR series
        int[] b = new int[s1.length()];
        for(int j=0; j<s1.length(); j++){
            int count = 0;
            for(int k=j; k<s1.length(); k++){
                //b[j] = 0;
                if(i[j]>i[k]){
                    count++;
                    b[j] = count;
                }
            }
        }
        b[s1.length()-1] = 1;
        
        //Factorial series
        int[] c = new int[s1.length()];
        for(int j=s1.length()-1; j>0; j--){
            int f = 1;
            for(int n=j; n>0; n--){
                f = f*n;
            }
            c[(s1.length()-1)-j] = f;
        }
        c[s1.length()-1] = 1;
        
        //Rank calc
        int r = 0;
        int[] d = new int[s1.length()];
        for(int j=0; j<s1.length(); j++){
            d[j] = b[j]*c[j];
            r = r+d[j];
        }
        System.out.print(""+r);
    }
}
