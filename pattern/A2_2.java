/*
A
AB
ABC
ABCD
ABCDE
ABCDEF
*/
class A2_2
{
public static void main (String args[])
{
int Alpha=65;
for(int i=0;i<=5;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print((char)(Alpha+j));
}
System.out.println();
}
}
}