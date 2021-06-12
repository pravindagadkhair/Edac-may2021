package LinkedList;

import LinkedList.List3.Node;

class Swap{
Node head;
static class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
	
}

public void display()
{
	 Node n = head;
	 while(n != null)
	 {
		 System.out.print(n.data+ "--->");
		 n = n.next;
		 
	 }
		 
}

public void swap()
{
Node n1=head;
while(n1!=null && n1.next!=null)
{
int temp=n1.data;
n1.data=n1.next.data;
n1.next.data=temp;
n1=n1.next.next;
}
}
 public void insert(int data)
 {
	 Node newnode=new Node(data);
	 newnode.next=head;
	 head=newnode;
	 
 }
public static void main(String []args)
{
Swap s=new Swap();
//case 1:
s.insert(5);
s.insert(4);
s.insert(3);
s.insert(2);
s.insert(1);
//s.insert(2);
//s.insert(3);
//s.insert(4);
//s.insert(5);
//case 3:
//s.insert(1);
s.display();
System.out.println();
s.swap();
s.display();
}
}