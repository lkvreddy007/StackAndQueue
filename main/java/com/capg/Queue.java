package com.capg;

public class Queue<K> {
	private MyLinkedList<K> linkedList;
	
	public Queue() {
		this.linkedList=new MyLinkedList();
	}
	
	public void enqueue(INode<K> node) {
		linkedList.append(node);
	}
	
	public INode<K> dequeue(){
		return linkedList.popFirst();
	}
	
	public int size() {
		return linkedList.size();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	public void printQueue(){
		linkedList.print();
	}
}
