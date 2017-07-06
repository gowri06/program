import java.io.*;
import java.util.Scanner;
class unique
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter num of elements in array");
int a[]=new int[s.nextInt()];
for(int i-0;i<a.length;i++)
{
System.out.println("enter element["+i+"]:");
a[i]=s.nextInt();
}
Arrays.sort(a);
for(int i=0;i<a.length-1;i+=2)
{
if(a[i]!=a[i+1]
{
System.out.println("unique num:"+a[i]);
break;
}
}
}
}
