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
public class stack {
    final int max = 10;
    int[] stack = new int[max];
    int top = -1;
    Scanner s = new Scanner(System.in);
    
    void push(){
    int num;
    if(top>=max-1){
        System.out.print("stack is full");
    } else{
        System.out.print("enter no.");
        num = s.nextInt();
        top++;
        stack[top] = num;
        System.out.print(num+"is pushed in stack");
    }
}

void pop(){
    int temp;
    if(top==-1){
        System.out.print("stack is empty");
    } else{
        temp = stack[top];
        top--;
        System.out.print(temp+"is poped from stack");
    }
}

void display(){
    int i;
    if(top==-1){
        System.out.print("stack is empty");
    } else{
        for(i=top; i>=0; i--){
            System.out.print("\n"+stack[i]);
        }
    }
}

    public static void main(String[] args) {
        // TODO code application logic here
        stack obj = new stack();
        Scanner s = new Scanner(System.in);
        int ch;
        int n = 1;
        while(n!=0){
            System.out.print("Enter choice\n1. push\n2. pop\n3. display\n4. quit");
            ch = s.nextInt();
            switch(ch){
                case 1: obj.push();
                    break;
                case 2: obj.pop();
                    break;
                case 3: obj.display();
                    break;
                case 4: System.exit(0);
                default:
                    System.out.print("\ninvalid choice");
            }
        }
    }
}
