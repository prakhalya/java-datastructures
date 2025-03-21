
package Datastructure;
class DoublyLinkedListNode {
    int data;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;

    DoublyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    DoublyLinkedListNode head;

    DoublyLinkedList() {
        head = null;
    }
    
    void insertAtBeginning(int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        
        head = newNode;
    }

    // Insert a node after a specific node
    void insertAfter(DoublyLinkedListNode prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        newNode.next = prevNode.next;  // Set newNode's next to prevNode's next
        prevNode.next = newNode;  // Set prevNode's next to newNode

        newNode.prev = prevNode;  // Set newNode's prev to prevNode

        // If newNode's next is not null, set its prev to newNode
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    // Delete a node by value
    void deleteNode(int key) {
        // If the list is empty, no node to delete
        if (head == null) return;

        // If the node to delete is the head node
        if (head.data == key) {
            head = head.next;  // Move head to the next node
            if (head != null) {
                head.prev = null;  // Set prev of new head to null
            }
            return;
        }

        // Find the node with the given value
        DoublyLinkedListNode current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
    if (current == null) {
            System.out.println("Node with value " + key + " not found");
            return;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    
    void display() {
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Doubly_linllist {
    public static void main(String args[]) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display(); 

        
        DoublyLinkedListNode node = list.head.next; 
        list.insertAfter(node, 25);
        list.display(); 

        // Delete a node by value
        list.deleteNode(20);  
        list.display(); 

        // Delete the head node
        list.deleteNode(30); 
        list.display(); 
    }
}

