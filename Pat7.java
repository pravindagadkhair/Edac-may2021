class Pat7
{
public static void main(String args[])
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(" ");
}
for(int k=4;k>=i;k--)
{
System.out.print(k);
}
System.out.println();
}

}
}


//o/p             (i)                (k)
// ****           1111          4321
//   ***             222            432
//     **               33              43
//       *                 4                4