import java.io.*;
import java.util.Scanner;
class Lo
{
public static void main(String args[])
{
String p="";
if(args.length>0)
{
p=args[0];
}
for(int i=1;i<args.length;i++)
{
String a=args[i];
int j=0;
for(;j<Math.min(p.length(),args[i].length());j++)
{
if(p.charAt(j)!=a.charAt(j))
{
break;
}
}
p=args.substring(0,j);
}
return p;
}
}
