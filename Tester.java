package project2package;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tester {
	
	LinkedList<Integer> testlist = new LinkedList<Integer>();
	ReverseList list = new ReverseList(testlist);
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	Stack<Integer> stack3 = new Stack<Integer>();
	Stack<Integer> stack4 = new Stack<Integer>();
	Queue<Integer> queue = new LinkedList<Integer>();
	Queue<Integer> emptyQueue = new LinkedList<Integer>();
	CustomQStack queuestack = new CustomQStack(queue);
	CustomQStack queuestack2 = new CustomQStack(emptyQueue);
	CustomSQueue stackqueue = new CustomSQueue(stack, stack2);
	CustomSQueue stackqueue2 = new CustomSQueue(stack3, stack4);
	
	public static void main(String[] args) {
		Tester test = new Tester();
		System.out.println("THE TESTER IS NOW CREATING A LINKED LIST.");
		System.out.println("");
		System.out.println("THE LIST IS BELOW.");
		test.createList();
		System.out.println("");
		System.out.println("THE TESTS ARE NOW RUNNING.");
		System.out.println("");
		System.out.println("TESTING THE reverse METHOD");
		System.out.println("");
		System.out.println("List before the operation:");
		test.printList();
		System.out.println("");
		System.out.println("List after the operation: ");
		test.testReverse();
		System.out.println("");
		System.out.println("THE TESTER IS NOW CREATING A QUEUE.");
		System.out.println("");
		System.out.println("THE QUEUE IS BELOW.");
		test.createQueueStack();
		System.out.println("");
		System.out.println("TESTING THE empty METHOD. FIRST, ON AN EMPTY LIST.");
		test.testIsEmpty1();
		System.out.println("");
		System.out.println("TESTING empty ON A FULL LIST.");
		test.testIsEmpty2();
		System.out.println("");
		System.out.println("TESTING THE push METHOD.");
		test.testpush();
		System.out.println("");
		System.out.println("TESTING THE pop METHOD. FIRST, ON AN EMPTY LIST.");
		test.testPop1();
		System.out.println("");
		System.out.println("TESTING pop ON A FULL LIST.");
		test.testPop2();
		System.out.println("");
		System.out.println("THE TESTER IS NOW CREATING STACKS.");
		System.out.println("");
		System.out.println("THE FIRST STACK IS BELOW. THE SECOND STACK IS EMPTY.");
		test.createStackQueue();
		System.out.println("");
		System.out.println("TESTING THE add METHOD:");
		test.testAdd();
		System.out.println("");
		System.out.println("TESTING THE poll METHOD. FIRST, ON AN EMPTY STACK.");
		test.testPoll1();
		System.out.println("");
		System.out.println("TESTING poll ON A FULL STACK.");
		test.testPoll2();
		System.out.println("");
		System.out.println("THE TESTS ARE COMPLETE.");
	}
	
	public void createList() {
		for (int i = 0; i < 15; i++) {
			testlist.add(i);
		}
		System.out.println(testlist);
	}
	
	public void testReverse() {
		list.reverse();
	}
	
	public void printList() {
		System.out.println(testlist);
	}
	
	public void createQueueStack() {
		for (int i = 0; i < 15; i++) {
			queue.add(i*2);
		}
		System.out.println(queue);
	}
	
	public void testIsEmpty1() {
		queuestack2.empty();
	}
	
	public void testIsEmpty2() {
		queuestack.empty();
	}
	
	
	public void testpush() {
		queuestack.push(21);
	}
	
	public void testPop1() {
		queuestack2.pop();
	}
	
	public void testPop2() {
		queuestack.pop();
	}
	
	public void createStackQueue() {
		for (int i = 0; i < 15; i++) {
			stack.add(i*i);
		}
		System.out.println(stack);
	}
	
	public void testAdd() {
		stackqueue.add(21);
	}
	
	public void testPoll1() {
		stackqueue2.poll();
	}
	
	public void testPoll2() {
		stackqueue.poll();
	}

}