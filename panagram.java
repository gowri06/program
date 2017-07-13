import java.util.*;
import java.util.Scanner;
class panagram
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String a=s.next();
String b=a.toLowerCase();
ArrayList<String>al=new ArrayList<String>();
ArrayList<String>a=new ArrayList<String>();
for(char i='a';i<='z';i++)
{
al.add(Character.toString(i));
}
for(int i=0;i<b.length();i++)
{
char k=b.charAt(i);
a.add(Character.toString(k));
}
if(a.contaisAll(al))
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
