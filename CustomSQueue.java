package project2package;

import java.util.Stack;

public class CustomSQueue {
	
Stack<Integer> stack1 = new Stack<Integer>(); //instantiates two stacks
Stack<Integer> stack2 = new Stack<Integer>();
	
	public CustomSQueue(Stack<Integer> stack1, Stack<Integer> stack2) {
		this.stack1 = stack1;
		this.stack2 = stack2;
	}
	
	public void add(int i) {
		stack1.push(i); //adds i to the end of the stack
		System.out.println(stack1);
	}
	
	public int poll() {
		int i; //to keep a placeholder for each integer as it swaps lists.
		int j; //to keep track of the value that is removed.
		if (stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("The Stack is empty."); //ends the operation if both stacks are empty.
			return -1;
		}
		if (stack2.isEmpty()) {
            while (stack1.isEmpty() == false) {
                i = stack1.pop(); //removes the end of stack1
                stack2.push(i); //adds the end of stack1 to the beginning of stack2
            }
        }
        i = stack2.pop(); //removes the last value of stack2 (the first value of stack1)
        j = i; //keeps track of the removed value as i is going to change again
        while (stack2.isEmpty() == false) {
        	i = stack2.pop(); //removes the end of stack2
        	stack1.push(i); /*adds the end of stack2 to the beginning of stack1, putting the list in proper
        	order with the original first element removed.*/
        }
        System.out.println(stack1);
        return j;
	}
}