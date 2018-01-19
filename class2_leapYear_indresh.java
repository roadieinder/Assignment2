import java.util.Scanner;
class2_leapYear_indresh
{
public static void main(String[] args)
{
int x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year");
x=sc.nextInt();
if(x%4==0)
{
System.out.print("it is a leap year");
}
else
{
System.out.print("not a leap year");
}
}
}