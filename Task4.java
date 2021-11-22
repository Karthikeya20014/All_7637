/*Q1
Car Fueling problem
*/
import java.util.*;
import java.io.*;
public class Main
{
static int compute_refills(int dist,int tank,int stops[],int n){
int current_refills=0;
int num_refills=0;
int last_refill=0;
while(current_refills<n-1){
last_refill=current_refills;
while((current_refills <n-1)&&(stops[current_refills +1] - stops[last_refill])<=tank){
current_refills=current_refills+1;
break;}
if (current_refills == last_refill)
return -1;
if(current_refills<n-1)
num_refills=num_refills+1;}
return num_refills;
}
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter how much distance you want to go: ");
int dist=scanner.nextInt();
System.out.print("Enter the tank capacity");
int tank=scanner.nextInt();
System.out.println("Enter how many stops");
int n=scanner.nextInt();
System.out.print("Enter stops: ");
int stops[] =new int[n*n*n];
for(int i=0;i<n;i++){
stops[i]=scanner.nextInt();
}
System.out.println("Total refills"+compute_refills(dist,tank,stops,n));
}
}


/*Q2Salary Problem*/
import java.util.*;
public class Main{
public static String largestnumber(String[]salaryParts){
int numParts = salaryParts.length;
if(salaryParts == null || numParts == 0)
return "";
String[]maxSalary = new String[numParts];
for(int i =0;i<numParts;++i) {
maxSalary[i] =String.valueOf(salaryParts[i]);
}
Arrays.sort(maxSalary, (s1,s2)->(s2 +s1).compareTo(s1 + s2));
StringBuilder sb = new StringBuilder();
for(String salaryPart : maxSalary) {
sb.append(salaryPart);
}
return sb.toString();
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[] salaryParts = new String[n];
for(int i= 0;i<n;i++){
salaryParts[i] =sc.next();
}
System.out.println(largestnumber(salaryParts));
}
}
