class Pat5
{
public static void main(String args[])
{
for(int i=1;i<=4;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" "+j);
}
System.out.println();
}
}
}

// output: (j)               if print (i)
//4321                      1111
//432                        222
//43                          33
//4                             4