/*Q1Money Exchange Problem*/
import java.util.*;
public class Main
{
static void moneyChange(int x)
{
    int[] deno = { 1, 5, 10 }; 
    int n = deno.length;
    List<Integer> list = new ArrayList();
    for(int i=n-1;i>=0;i--)
    {
        while (x >= deno[i])
        {
            x -= deno[i];
            list.add(deno[i]);
            }
            }
            System.out.println("Number of minimum coins is: " + list.size());
            for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
            }
            public static void main(String args[]) 
            {
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter the amount: ");
                int n=sc.nextInt();
                moneyChange(n);
                }
                
    
}


/*Q2Advertisement Revenue*?
n = int(input())
a = [int(i) for i in input().split()]
b = [int(i) for i in input().split()]
a.sort()
b.sort() 
ans = sum([a[i]*b[i] for i in range(n)])
print(ans)

