  /*            
             1
            121
           12321
          1234321
         123454321
        12345654321
       1234567654321
      123456787654321
     12345678987654321
*/
 class P5
{
public static void main(String args[])
{
for(int i=1;i<=9;i++)
{
for(int j=8;j>=i;j--)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(k);
}
for(int l=i-1;l>=1;l--)
{
System.out.print(l);
}
System.out.println();
}

}
}
