package Medcare;

import java.util.Scanner;


public class DEQueueSD<T> implements DequeInterfaceSD<T> {

	protected DLLNodeSD<T> front;      // reference to the front and rear of this deque
	protected DLLNodeSD<T> rear;
	protected int numElements = 0; 	 // number of elements in this dequeue

	public DEQueueSD(){ front = null; rear = null; }

	public boolean isFull() { return false; }

	public boolean isEmpty() { return (numElements == 0); }

	public int size() { return numElements; }

	
	public void enqueueFrontDis(T info, String name, String height, String weight, String illnes) {
		// We create a node with the given information
	
		DLLNodeSD<T> nuevo = new DLLNodeSD<T>(info, name, height, weight, illnes);
		
		// First we check if the queue is empty in this case we just set
		// front and rear to the new node
		if (isEmpty()) { 
			front = nuevo; 
			rear = nuevo;
		
		// If is not empty we add the new node to the front 
		} else {
			nuevo.setForward(front);
			front.setBack(nuevo);
			front = nuevo;
		}
		
		// We add one to numElements
		numElements++;
	}

	
	public DLLNodeSD getnode(String target) {
		// We create an empty string, and a temporary node with the info of the front 
		DLLNodeSD<T> tempNode = front;

		
		if (isEmpty()) { System.out.println("Queue Empty");} 

		else if (numElements >= 1){
			while (tempNode.getForward() != null) {
				if (target.equals(tempNode.getName())) {
					return tempNode;
				}
				tempNode = tempNode.getForward();
			}
			
			if (target.equals(tempNode.getName())) {
				return tempNode;
			}
			
		}
		//return false; 
		return tempNode;
	}
	
	public boolean lookup(String target) {
		// We create an empty string, and a temporary node with the info of the front 
		DLLNodeSD<T> tempNode = front;

		
		if (isEmpty()) { System.out.println("Queue Empty");} 

		else if (numElements >= 1){
			while (tempNode.getForward() != null) {
				if (target.equals(tempNode.getName())) {
					return true;
				}
				tempNode = tempNode.getForward();
			}
			
			if (target.equals(tempNode.getName())) {
				return true;
			}
			
		}
		//return false; 
		return false;
	}
	
	
	
	public void lookUpString(String target) {
		// We create an empty string, and a temporary node with the info of the front 
		DLLNodeSD<T> tempNode = front;
		Scanner mod = new Scanner(System.in);
		String modSelection = null;

		
		if (isEmpty()) { System.out.println("Queue Empty");} 

		else if (numElements >= 1){
			while (tempNode.getForward() != null) {
				if (target.equals(tempNode.getInfo())) {
					System.out.println(infoString(tempNode));
				}
				tempNode = tempNode.getForward();
			}
			
			if (target.equals(tempNode.getInfo())) {
				System.out.println(infoString(tempNode));
				//return true;
			} else { System.out.println("There is not a patient with that code\n\nMedCare will close now.");} 
			
		}
		//return false; 
	}

	public String AllString() {
		// We create an empty string, and a temporary node with the info of the front 
		DLLNodeSD<T> tempNode = front;
		String finalS = null;
		
		if (isEmpty()) { finalS = "None";} 

		else if (numElements >= 1){
			
			
			finalS = "";
			while (tempNode.getForward() != null) {
				finalS += tempNode.getName() + ", ";
				tempNode = tempNode.getForward();
			}
			finalS += tempNode.getName();
		}
		return finalS;
		
	}
	
	private String infoString(DLLNodeSD o) {
		return "Name " + o.getName() ;
	}
	
}
