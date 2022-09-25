package project2package;

import java.util.LinkedList;
import java.util.Queue;

public class CustomQStack {
	
	Queue<Integer> queue = new LinkedList<Integer>(); //creates a queue
	
	public CustomQStack(Queue<Integer> queue) {
		this.queue = queue;
	}
	
	public boolean empty() {
		if (queue.isEmpty()) { //to determine if the queue is empty
			System.out.println("The queue is empty.");
			return true; //returns true if isEmpty() == true, false if not.
		}
		System.out.println("The queue is not empty.");
		return false;
	}
	
	public void push(int b) {
		queue.add(b); //adds b to the end of the queue
		System.out.println(queue);
	}
	
	public int pop() {
		int size = queue.size(); //keeps track of the size of the original queue
		int j = 0; //a placeholder variable for elements that are swapped around in the queue
		if (queue.isEmpty()) {
			System.out.println("There are no elements in this list.");
			return -1; //checks if the queue is empty and ends the operation if it is.
		}
		for (int i = 0; i < size; i++) { //iterates through the queue
			j = queue.remove(); //removes the element from the start of the queue
			queue.add(j); //adds the element to the end of the queue
		}
		queue.remove(j); //now that the last element is the head of the queue, remove it
		System.out.println(queue);
		return j; //returns the original last element of the queue, which is removed
	}	
}