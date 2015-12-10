/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ipproxii;

import java.util.Scanner;

/**
 *
 * @author in
 */
public class hcf {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        //Finding H.C.F.
        System.out.println("\n Find H.C.F.!");
        System.out.println("Enter any two no.");
        int u = s.nextInt();
        int v = s.nextInt();
        int i;
        for (i = u; i>=1; i--){
            if (u%i==0 && v%i==0){
                System.out.println("The H.c.F. is "+i);
                break;
            } 
        }
        if (u%i!=0 && v%i!=0){
            System.out.println("The H.C.F. is 1");
        }
    }
}
