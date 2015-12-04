/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.util.Scanner;

/**
 *
 * @author JARVIS
 */
public class queue {
    final int max = 10;
    int[] q = new int[max];
    int f=0, r=-1;
    Scanner s = new Scanner(System.in);
    
    void insert(){
        int num;
        if(r>=max-1){
            System.out.print("queue is full");
        } else{
            System.out.print("Enter no.");
            num = s.nextInt();
            r++;
            q[r] = num;
            System.out.print(num+" is inserted in queue");
        }
    }
    
    void remove(){
        int temp;
        if(f>r){
            System.out.print("queue is empty");
        } else{
            temp = q[f];
            f++;
            System.out.print(temp+" is removed");
        }
    }
    
    void display(){
        int i;
        if(f>r){
            System.out.print("queue is empty");
        } else{
            for(i=r; i>=f; i--){
                System.out.println(q[i]);
            }
        }
    }
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int ch;
        int n = 1;
        queue obj = new queue();
        while(n!=0){
            System.out.print("\nEnter choice\n1. insert\n2. remove\n3. display\n4. quit");
            ch = s.nextInt();
            switch(ch){
                case 1: obj.insert();
                    break;
                case 2: obj.remove();
                    break;
                case 3: obj.display();
                    break;
                case 4: System.exit(0);
                    
                default: System.out.print("invalid");
            }
        }
    }
}
