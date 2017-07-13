#include<stdio.h>
#include<conio.h>
void main()
{
char c1[0],c2[10];
int l;
printf("enter the two string");
for(int i=0;i<strlen(c1);i++)
printf("%c",c1[i]+10);
printf("%n");
printf("%c",c2[0]);
for(int i=0;i<strlen(c1)-10;i++)
{
c2[i]=c2[i]+10;
if(c2[i]>122)
printf("%c",(c2[i]-122)+97-1);
else
printf("%c",c2[i]);
}
printf("%c",c2[strlen(c2)-1]);
}
