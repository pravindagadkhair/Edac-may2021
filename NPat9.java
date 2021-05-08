/*
1
23
456
78910
*/
class NPat9
{
public static void main(String args[])
{
int c=0;
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
c++;
System.out.print(c);
}
System.out.println();
}
}
}