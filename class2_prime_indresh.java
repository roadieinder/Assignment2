import java.util.Scanner;
class prime
{
public static void main(String[] args)
{
int n;
int i;
boolean prime=true;
System.out.print("enter the number ");
n=new Scanner(System.in).nextInt();
for(i=2;i<n-1;i++)
{
if(n%i==0)
{
System.out.println(" n is not a prime no ");
prime=false;
break;
}
}
if(prime)
{System.out.println(" n is a prime no ");}
}
}










