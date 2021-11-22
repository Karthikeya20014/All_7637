/*Q1Fibanocci series Naive algorithm*/
import java.util.*;
public class Fibo{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number to calculate series: ");
 int n=sc.nextInt();
 for(int i = 0; i <n; i++){
System.out.print(Fib(i) +" ");
}
}
 
 static int Fib(int n){
 if(n<=1){
 return n;
 }
 else return Fib(n-1)+Fib(n-2);
 }
}


/*Q2Fibanocci series Dynamic Programming*/
import java.util.*;
public class Main{
 public static void main (String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
 
 int n=sc.nextInt();
 fib(n);
 }
 static void fib(int n){
 int f[] = new int[n+2];
 f[0] = 0;
 System.out.println("the fabinocci series is: ");
 f[1] = 1;
 System.out.print(f[0]+" "+f[1]+" ");
 for (int i = 2; i <n; i++){
 f[i] = f[i-1] + f[i-2];
 System.out.print(f[i]+" ");
 }
 }
 
}


/*Q3GCD Naive Algorithm*/
import java.lang.Math;
import java.util.Scanner;
public class Main {
 public static void main(String[] args){
 System.out.println(GCD(20,42));
 }
 static int GCD(int a,int b) {
 int maximum=Math.max(a,b);
 int num=maximum-1;
 while(num>1){
 if((a%num==0)&&(b%num==0)){
 return num;
 } else {
 num--;
 }
 
 }
 return 1;
 }
}


/*Q4GCD Dynamic Programming*/
import java.util.*;
import java.lang.*;
public class Main{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the two numbers to find GCD:");
 System.out.println("GCD of two numbers is : " 
+gcd(sc.nextInt(),sc.nextInt()));
 }
 public static int gcd(int a, int b){
 if (a == 0){
 return b;
 }
 return gcd(b%a, a);
 }
}
