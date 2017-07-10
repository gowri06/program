import java.io.*;
import java.util.Scanner;
class Target
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[args.length];
int c;
for(int i=0;i<args.length;i++)
{
b[i]=Integer.parseInt(args[i]);
}
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b.length;j++)
{
if(i!=j)
{
c=b[i]+b[j];
if(a==c)
{
System.out.println(b[i]+"ans"+b[j]);
break;
}
}
}
}
}}
