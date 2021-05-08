/*
A
BB
CCC
DDDD
EEEEE
FFFFFF
*/
class A2_5
{
public static void main(String args[])
{
int Alpha=65;
for(int i=0;i<=5;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print((char)(Alpha+i));
}
System.out.println();
}
}
}