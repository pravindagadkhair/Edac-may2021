 /*
                            9
                          898
                       78987
                    6789876
                 567898765
              45678987654
           3456789876543
        234567898765432
     12345678987654321
*/

 class P6
{
public static void main(String args[])
{
for(int i=9;i>=1;i--)
{
for(int l=i;l>=1;l--)
{
System.out.print(" ");
}
for(int j=i;j<=9;j++)
{
System.out.print(j);
}
for(int k=8;k>=i;k--)
{
System.out.print(k);
}
System.out.println();
}
}
}