import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;

class main {

	public static void main(String args[]) {
		Random rand = new Random();
		/*
		Node head = new Node(rnd());
		Node prev = head;
		for (int i=0;i<19;i++){
			Node n = new Node(rnd());
			prev.setNext(n);
			prev = n;
		}

		SinglyLinkedList sll = new SinglyLinkedList(head);
		sll.printList();
*/

		Node n = new Node(5);
		SinglyLinkedList list = new SinglyLinkedList(n);

		//part 1
		for(int i = 0;i<20;i++){
			Node next = new Node(rand.nextInt(100));
			n.setNext(next);
			n = n.getNext();
		}
		list.printList();

		//part 2
		for(int i = 0;i<20;i++){
			list.insert(rand.nextInt(19),-1);
		}
		System.out.println("");
		list.printList();
	}
}
