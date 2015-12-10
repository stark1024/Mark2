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
public class lcm {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        //Finding L.C.M.
        System.out.println("\n Find L.C.M. !");
        System.out.println("Enter any two no.");
        int e = s.nextInt();
        int f = s.nextInt();
        int h = 0;
        for (int i = 1; i<=e; i++){
            h = e * i;
            if (h%f == 0){
                System.out.println("L.C.M. is "+h);
                break;
            }
        }
        if (h%f != 0){
            System.out.println("L.C.M. is "+e*f);
        }
    }
}
