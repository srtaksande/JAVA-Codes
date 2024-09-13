package singly;

public class SinglyLinkedList {
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		if (head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void display()
	{
		Node current = head;
		if(head == null)
		{
			System.out.println("List is EMPTY !!!");
			return;
		}
		System.out.println("Nodes of Singly Linked List: ");
		
		while(current != null)
		{
			System.out.println(current.data + "  ,  ");
			if (current.next != null)
			{
				System.out.println("Next =  "+ current.next.data);
			}
			else
			{
				System.out.println("Next = Null");
			}
			current = current.next;
		}

	}

}
