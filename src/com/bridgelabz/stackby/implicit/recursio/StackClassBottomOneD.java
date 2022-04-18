package com.bridgelabz.stackby.implicit.recursio;
//question Push at the Bottom of Stack
import java.util.*;
public class StackClassBottomOneD {
	public static void PushAtBottom(int data,Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);//base case
			return;
		}
		int Top = s.pop();
		PushAtBottom(data, s);
		s.push(Top);
	}
	public static void main(String[] args) {
		Stack <Integer> s =new Stack <>();
		s.push(1);
		s.push(2);
		s.push(3);
		 PushAtBottom( 4, s);
		 
		 while(!s.isEmpty()) {
			 System.out.println(s.peek());
			 s.pop();
		 }
	}
}
