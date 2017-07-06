import java.io.*;
import java.util.Scanner;
class Ac
{
public static void main(String args[])
{
String s;
Scanner ss=new Scanner(System.in);
System.out.println("enter string");
s=ss.nextLine();
int n=s.length();
System.out.println("no of  possible ways to group the string:"+(n+1-1));
}
}
