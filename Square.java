import java.util.*;
import java.util.Scanner;
class Square
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt[2];
int b=s.nextInt[2];
int c=s.nextInt[2];
int d=s.nextInt[2];
int a1,a2,a3,a4;
System.out.println("enter the 1st co-ordinate points");
for(int i=0;i<2;i++)
{
a[i]=s.nextInt();
}
a1=a[0]-a[1];
System.out.println("enter the 2nd co-ordinate points");
for(int i=0;i<2;i++)
{
b[i]=s.nextInt();
}
a2=b[0]-b[1];
System.out.println("enter the 3rd co-ordinate points");
for(int i=0;i<2;i++)
{
c[i]=s.nextInt();
}
a3=c[0]-c[1];
System.out.println("enter the 4rth co-ordinate points);
for(int i=0;i<2;i++)
{
d[i]=s.nextInt();
}
a4=d[0]-d[1];
System.out.println("=================================");
if(a1+a3==0 || a1+a3==a1*2 && a2+a4==0 || a2+a4==a2*2)
{
System.out.println("the co-ordinates form a square");
}
else
{
System.out.println("the co-ordinate will not form square");
}
}
}
