import java.util.Scanner;
class Q12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter 1st nos.");
int a=sc.nextInt();
System.out.print("enter 2nd nos.");
int b=sc.nextInt();
System.out.print("enter 3rd nos.");
int c=sc.nextInt();
int sum=a+b+c;
float avg=sum/3;
System.out.println("average="+avg);
}

}