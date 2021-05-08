/*
     A
    B B
   C C C
  D D D D
 E E E E E
F F F F F F
*/
class A2_13
{
public static void main(String args[])
{
int Alpha=65;
for(int i=0;i<=5;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print((char)(Alpha+i)+" ");
}
System.out.println();
}
}
}