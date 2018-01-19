import java.util.Scanner;
class2_greater_indresh
{
public static void main(String[] args)
{
int a,b,c;
Scanner sc=new Scanner (System.in);
System.out.print("Enter the value of a");
a=sc.nextInt();
System.out.print("Enter the value of b");
b=sc.nextInt();
System.out.print("Enter the value of c");
c=sc.nextInt();
if(a-b>=0 && a-c>=0)
{
System.out.print("Greater no. ="+a);
}
else
{
if(b-a>=0 && b-c>=0)
System.out.print("Greater no. ="+b);
else
System.out.print("Greater no. ="+c);
}
}
}

