class Pat27
{
public static void main(String args[])
{
int c=0,sum=0;
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
c++;
System.out.print(c+" ");
sum=sum+c;
}
System.out.print(sum);
sum=0;
System.out.println();
}
}

}