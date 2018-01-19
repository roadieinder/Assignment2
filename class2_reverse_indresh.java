import java.util.Scanner;
class2_reverse_indresh
{
public static void main(String[] args)
{
int n;
int r;
int s=0;
System.out.print("enter the value of n");
n=new Scanner(System.in).nextInt();
while(n>0)
{
r=n%10;
n=n/10;
s=s*10+r;
}
System.out.print(" reverse value is "+s);
}
}