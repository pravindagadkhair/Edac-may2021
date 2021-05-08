class Pat22
{
public static void main(String args[])
{
for(int i=1;i<=2;i++)
{
for(int j=7;j>(i*2);j--)
{
System.out.print("*");
}
System.out.println();
}

for(int i=1;i<=3;i++)
{
for(int j=1;j<(i*2);j++)
{
System.out.print("*");
}
System.out.println();
}
}
}

//output
//  *****
//  ***
//  *
//  ***
//  *****
