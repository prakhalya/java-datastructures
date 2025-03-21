package Datastructure;

public class Circular_linked {
	
	Node last;
	
	class Node
	{
		int data;
		Node next=null;
		
		Node(int val)
		{
			data=val;
			next=null;
		}
	}
	
	Circular_linked()
	{
		last=null;
	}
	
	public void insertAtBegin(int val)
	{
		Node newnode=new Node(val);
		if(last==null)
		{
			last=newnode;
			last.next=last; 
		}
		else
		{
			newnode.next=last.next;
			last.next=newnode;
		}
	}
	
	public void insertAtLast(int val)
	{
		Node newnode=new Node(val);
		if(last==null)
		{
			last=newnode;
			last.next=last; 
		}
		else
		{
			newnode.next=last.next;
			last.next=newnode;
			last=newnode;
		}
	}
	public void deleteAtBegin(int val)
	{
		Node temp=last.next;
		last.next=last.next.next;
		temp.next=null;
		
	}
	public void deleteAtEnd() {
	    Node temp = last.next;
	    while (temp.next != last) temp = temp.next;  // Traverse to the second-to-last node
	    temp.next = last.next;  // Remove the last node by skipping it
	    last = temp;  // Update 'last' to the second-to-last node
	}

	public void display() {
	    
	    if (last == null) {
	        System.out.println("List is empty.");
	        return;
	    }

	    Node temp = last.next; 
	    
	    while (temp != last) {
	        System.out.println(temp.data);  
	        temp = temp.next;  
	    }

	   
	    System.out.println(temp.data);  
	}

	
	
	public static void main(String args[])
	{
		Circular_linked l=new Circular_linked();
		l.insertAtBegin(100);
		l.insertAtBegin(10);
		l.insertAtLast(111);
		l.insertAtBegin(20);
		l.insertAtBegin(66);
		l.insertAtBegin(77);
		
		l.deleteAtBegin(0);
		
		l.deleteAtEnd();
		
		l.display();
	}
	
	
}
