package pkg;
import java.util.Scanner;
import java.util.Random;


public class SinglyLinkedList {
	Node head;

	/* 
		Postcondition: The head will be null 
	*/
	public SinglyLinkedList(Node head) {
		this.head = head;
	}

	/* 
		Receives an integer position, searches through the SinglyLinkedList for the position and returns the data at that positon
	   	If the position doesn't exist, it returns -1
	*/ 
	public int get(int pos){
		Node n = head;
		if (n==null||pos<0)
			return -1;
		for(int i =0;i<pos;i++){
			if(n.getNext==null)
				return -1;
			n=n.getNext();
		}
		return n.getData();

	}

	/*
		Insert a new Node at the given position with the data given
	*/
	public void insert(int pos int data){
		Node n = head;
		for(int i = 0;i<pos;i++){
			if(n.getNext==null)
				return;
			n=n.getNext();
		}
		Node memory = n.getNext();
		Node newnode = new Node(data);
		newnode.setNext(memory);
		n.setNext(newnode);
	}

	/*
		Remove the node at the given position
		If no position exists, don't change the list
	*/
	public void remove(int pos){

	}

	/*
		Swap two Nodes with the two positions given
	*/
	public void swap(int pos1, int pos2){

	}

	/*
		Print all data values in the LinkedList 
	*/
	public void printList(){
		Node n = head;
		while(n.getNext!=null){
			System.out.print(n.getData+"-");
		}
	}
}
