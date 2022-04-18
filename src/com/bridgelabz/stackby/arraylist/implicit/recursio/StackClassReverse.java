package com.bridgelabz.stackby.arraylist.implicit.recursio;
//reverse stack

import java.util.*;
public class StackClassReverse {
	public static void PushAtBottom(int data , Stack<Integer>s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		PushAtBottom(data, s);
		s.push(top);
	}
	public static void reverse(Stack<Integer>s) {
		if(s.isEmpty()) {
			return;
		}
		int Top =s.pop();
		reverse(s);
		PushAtBottom(Top, s);
		
	}
	public static void main(String[] args) {
		Stack <Integer>s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		reverse(s);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
			
		}
	}
}
