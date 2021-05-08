/*
ABCDE
ABCD
ABC
AB
A
*/
class A2_18
{
public static void main(String args[])
{
int Alpha=65;
for(int i=4;i>=0;i--)
{
for(int j=0;j<=i;j++)
{
System.out.print((char)(Alpha+j));
}
System.out.println();
}
}
}