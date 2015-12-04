/* 
2  * To change this license header, choose License Headers in Project Properties. 
3  * To change this template file, choose Tools | Templates 
4  * and open the template in the editor. 
5  */ 
6 package ippro; 
7 
 
8 import java.util.Scanner; 
9 
 
10 /** 
11  * 
12  * @author JARVIS 
13  */ 
14 public class Rank { 
15     public static void main(String args[]){ 
16         System.out.print("This program is only for words with NON-REPEATED letters\n"); 
17         Scanner s = new Scanner(System.in); 
18         String s1 = s.next(); 
19         s1 = s1.toUpperCase(); 
20          
21         //User Array 
22         char[] a = new char[s1.length()]; 
23         for(int j=0; j<s1.length(); j++){ 
24             a[j] = s1.charAt(j); 
25         } 
26          
27         //Order series 
28         int[] i = new int[s1.length()]; 
29         for(int j=0; j<s1.length(); j++){ 
30             i[j] = a[j]-64; 
31         } 
32          
33         //KR series 
34         int[] b = new int[s1.length()]; 
35         for(int j=0; j<s1.length(); j++){ 
36             int count = 0; 
37             for(int k=j; k<s1.length(); k++){ 
38                 //b[j] = 0; 
39                 if(i[j]>i[k]){ 
40                     count++; 
41                     b[j] = count; 
42                 } 
43             } 
44         } 
45         b[s1.length()-1] = 1; 
46          
47         //Factorial series 
48         int[] c = new int[s1.length()]; 
49         for(int j=s1.length()-1; j>0; j--){ 
50             int f = 1; 
51             for(int n=j; n>0; n--){ 
52                 f = f*n; 
53             } 
54             c[(s1.length()-1)-j] = f; 
55         } 
56         c[s1.length()-1] = 1; 
57          
58         //Rank calc 
59         int r = 0; 
60         int[] d = new int[s1.length()]; 
61         for(int j=0; j<s1.length(); j++){ 
62             d[j] = b[j]*c[j]; 
63             r = r+d[j]; 
64         } 
65         System.out.print(""+r); 
66     } 
67 } 
