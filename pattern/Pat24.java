class Pat24
{
public static void main(String args[])
{
int c=0;
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
c++;
}
System.out.println();
}
}
}

//output
//1
//12
//123
//1234