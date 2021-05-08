 /*
     5
   454
  34543
 2345432
12345432
*/
class Pat36
{
public static void main(String args[])
{
for(int i=5;i>=1;i--)
{
for(int j=2;j<=i;j++)
{
System.out.print(" ");
}
for(int k=i;k<=5;k++)
{
System.out.print(k);
}
for(int l=4;l>=i;l--)
{
System.out.print(l);
}
System.out.println();
}
}
}