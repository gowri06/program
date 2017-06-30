import java.io.*;
import java.util.Scanner;
class subset
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=s.nextInt();
int aa[]=s.nextInt();
for(int i=0;i<a.length;i++)
{
for(int j=0;j<aa.length;j++)
{
if(a[j]==aa[j])
{
System.out.println("subset);
else
{
System.out.println("not subset);
}
}
}
}
