package com.capg;

public class Stack <K>{
	private final MyLinkedList<K> linkedList; 
	
	public Stack() {
		this.linkedList=new MyLinkedList<K>();
	}
	public void push(INode<K> element) {
	linkedList.add(element);
	}
	
	public INode<K> peek(){
		return linkedList.head;
	}
	
	public INode<K> pop(){
		return linkedList.popFirst();
	}
	
	public void printStack() {
		linkedList.print();
	}
	
	public int size() {
		return linkedList.size();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
}
