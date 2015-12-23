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
public class sos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        // Sum of squares
        int n = 0 ;
        System.out.println("\nSum till?");
        int s2 = s.nextInt();
        for (int p = 1; p<=s2; p++){
            int q = p * p;
            System.out.print(q+" ");
            n = n + q;
        }
        System.out.println();
        System.out.print("The sum of the above is "+ n);
    }
}
