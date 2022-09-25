package project2package;

import java.util.LinkedList;

public class ReverseList {
	
	private LinkedList<Integer> list; //instantiates a linked list
	
	public ReverseList(LinkedList<Integer> list) { 
		this.list = list;
	}
	
	public void reverse() {
		for (int i = 0; i < list.size(); i++) { //iterates through the linked list
			list.add(i, list.removeLast()); //adds i in its place in reverse order
		}
		System.out.println(list);
	}

}