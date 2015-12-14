/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author JARVIS
 */
public class exp_pal {
    public static void main(String args[]){
        String s = "aba abba abcba";
        String p = "", s1, s2;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                s1 = s.substring(i, j+1);
                System.out.println(""+s1);
                s2 = new StringBuffer(s1).reverse().toString();
                if(s1.equalsIgnoreCase(s2) && s1.length()>p.length()){
                    p = s1;
                }
            }
        }
        System.out.println("longest palindrome is: "+p);
    }
}
