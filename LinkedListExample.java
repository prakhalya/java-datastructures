package Datastructure;

	class ListNode {
	    int value;
	    ListNode next;

	    // Constructor to create a new node
	    public ListNode(int value) {
	        this.value = value;
	        this.next = null;
	    }
	}

	public class LinkedListExample {

	    // Method to insert at the beginning
	    public static ListNode insertAtBegin(ListNode head, int value) {
	        ListNode newNode = new ListNode(value);
	        newNode.next = head;
	        return newNode;  // New node becomes the head
	    }

	    // Method to insert at a specific position
	    public static ListNode insertAtPosition(ListNode head, int value, int position) {
	        // Special case: inserting at the beginning (position 0)
	        if (position == 0) {
	            return insertAtBegin(head, value);
	        }

	        ListNode newNode = new ListNode(value);
	        ListNode current = head;

	        // Traverse to the node before the desired position
	        for (int i = 0; current != null && i < position - 1; i++) {
	            current = current.next;
	        }

	        if (current == null) {
	            // If position is out of bounds, return the list as is
	            System.out.println("Position is out of bounds");
	            return head;
	        }

	        // Insert the new node at the desired position
	        newNode.next = current.next;
	        current.next = newNode;

	        return head;
	    }

	    // Method to print the linked list
	    public static void printList(ListNode head) {
	        ListNode current = head;
	        while (current != null) {
	            System.out.print(current.value + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        // Initialize the linked list with values 1, 2, 3, 4
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);

	        // Print the original list
	        System.out.println("Original List:");
	        printList(head);

	        // Insert 777 at the beginning
	        head = insertAtBegin(head, 777);

	        // Insert 333 at the 3rd position (index 3)
	        head = insertAtPosition(head, 333, 3);

	        // Print the updated list
	        System.out.println("Updated List:");
	        printList(head);
	    }
	}



