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
public class IpproXII {
static int x;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("PassCode : ");
        String pass = s.next();
        if (pass.equals("IPProXII")){
        String s4 = null;
        
        do{
        System.out.println("\nPlease select any of the following apps - "
                + "\n1) Fabonachi sequence "
                + "\n2) Factorials"
                + "\n3) Sum of squares"
                + "\n4) Calculator"
                + "\n5) Tables"
                + "\n6) L.C.M."
                + "\n7) H.C.F.");
        int s3 = s.nextInt();
        
                
        // Fabonachi sequence
        if(s3 == 1){
        int x = 0, y = 1;
        System.out.print("\nFabonachi sequence >> ");
        System.out.println("How many no.(s) do you want?");
        int s1 = s.nextInt();
        for (int i = 1; i<=s1; i++){
            int z = x + y;
            x = y;
            y = z;
            System.out.print(z+" ");
        }
        System.out.print("\n");
        }
        
        
        // Factorial
        if(s3 == 2){
        System.out.println("\nFactorial of?");
        long a = s.nextLong(), c = a;
        for (long b = a - 1; b>=1; b--){
            c = c * b;
        }
        System.out.println("Factorial of "+a+" is \t"+c);
        }
        
        
        // Sum of squares
        if(s3 == 3){
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
        
        
        // Run time functionality
        if(s3 == 4){
        System.out.println("\nWelcome to Calculator!");
        String g = null;
        do{
        System.out.println("\nEnter value m");
        double m = s.nextInt();
        System.out.println("Enter value k");
        double k = s.nextInt();
        System.out.println("Which operation?");
        String r = s.next();
        double j = 0;
        if(r.equalsIgnoreCase("+")){
            j = m + k;
        }
        if(r.equalsIgnoreCase("-")){
            j = m - k;
        }
        if(r.equalsIgnoreCase("*")){
            j = m * k;
        }
        if(r.equalsIgnoreCase("/")){
            j = m / k;
        }
        System.out.println("Answer is "+j);
        System.out.println("Continue? y/n");
        g = s.next();
        } while(g.equalsIgnoreCase("y"));
    }
        
        
        //Table by one variable
        if (s3 == 5){
            System.out.println("\nTable of?");
            IpproXII.x = s.nextInt();
            for (int x = 1; x<=10; x++){
                System.out.print(x * IpproXII.x+" ");
            } 
            System.out.println("");
        }
        
        
        //Finding L.C.M
        if(s3 == 6){
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
        
        
        //Finding H.C.F.
        if (s3 == 7){
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
        
        
        System.out.println("\nOther app? y/n");
        s4 = s.next();
        } while(s4.equalsIgnoreCase("y"));
        }
    }
}
