 /*
      A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F
*/
class A2_9
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
System.out.print((char)(Alpha+k)+" ");
}
System.out.println();
}
}
}