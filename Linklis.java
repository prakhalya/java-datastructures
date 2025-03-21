package Datastructure;


class Node {
    int data;  
    Node next; 

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


 class LinkedList{
    Node head; 

    LinkedList() {
        head = null;
    }

     void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;           
        head = newNode;               
    }
    
    	 
     
  

    
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next; 
        }
        System.out.println("null");
    }
}


public class Linklis {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);         
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display(); 
    }
}
