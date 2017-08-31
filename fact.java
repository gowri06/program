import java.io.*;
import java.util.*;
class fact
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int f=1,u;
int a=s.nextInt();
for(int i=0;i<a;i++)
{
f=f*i;
System.out.println(f);
}
}
}
