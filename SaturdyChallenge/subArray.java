package LinkedList;

public class subArray {

public static int findLength(int[] a)
{
int n=a.length;
		
int start=0;
int end=n-1;
while(start<n-1 && a[start]<=a[start+1]) 
start++;
if(start==n-1)
return 0;
while(end>start && a[end]>=a[end-1])
end--;
		if(end==0)
			return n-1;
int result=Math.min(n-1-start , end);
int i=0,j=end;
while(i<=start && j<n)
{
 if(a[j]>=a[i])
{
result=Math.min(result, j-i-1);
i++;
}else {
j++;
				
}
}
		
return result;
		
}
public static void main(String[] args) {
//int a[]= {5,4,3,2,1};
int a[]= {1,2,3,10,4,2,3,5};
//int a[]={1,2,3};
//int a[]= {1};

System.out.println(subArray.findLength(a));
	}
	

}
