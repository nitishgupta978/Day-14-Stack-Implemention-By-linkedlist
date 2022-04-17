package com.bridgelabz.stackby.linkedlist;

public class StackClass {
	
	static class Node{                                    //1
		int data;
		Node nextRef;
		public Node(int data) {
			super();
			this.data = data;
			this.nextRef=null; 
		}
	}
		static  class Stack {
			public static Node head;
			public static boolean isEmpty() {
				return head == null;             // 2 line 1 and 2 every time we need this code its fixed for stack linkedlist impl.
			}
			
			public static void push(int data) {  // 3 for push
				Node newNode = new Node(data);
				if(isEmpty()) {
					head= newNode;
					return;
				}
				newNode.nextRef=head;
				head= newNode;
			}                              // 4 for push fixed code  line
		public static int pop() {
			if (isEmpty()) {
				return-1;
				
			}
			int top =head.data;
			head = head.nextRef;
			return top;                      // fixed for pop
		}
		 public  static int peek() {
			 if(isEmpty()) {
				 return-1;
			 }
			 return head.data;
		 }
	}
	public static void main(String[] args) {
         Stack s = new Stack();
		s.push(70);
		s.push(30);
		s.push(56);
		//s.push(4);
		while (!s.isEmpty()) {
			System.out.print( s.peek()+" -->");
			s.pop();
			
			
		}
	}
}

