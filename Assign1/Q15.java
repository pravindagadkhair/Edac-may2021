import java.util.*;
class Q15
{
public static void main(String[] args) {
int a,b,temp;
Scanner sc=new Scanner (System.in);
System.out.println("enter the first nos.");
a=sc.nextInt();
System.out.println("enter the second nos.");
b=sc.nextInt();
System.out.println("before swap:=\na="+a+"\nb="+b);
temp=a;
a=b;
b=temp;
System.out.println("after swap:\na="+a+"\nb="+b);
		
}

}