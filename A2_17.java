class A2_17
{
public static void main(String args[])
{
for(int i=1;i<=6;i++)
{
for(int j=6;j>=i;j--)
{
if(i==1 || i==j || j==6)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}