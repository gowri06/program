import java.io.*;
import java.util.Scanner;
class Aray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s1;
String s2="";
System.out.println("enter string);
s1=s.nextLine();
int b=s1.length();
for(int i=b-1;i>=0;i--)
{
s2=s2+s1.charAt(i);
}
System.out.println(""+s2);
}
}
