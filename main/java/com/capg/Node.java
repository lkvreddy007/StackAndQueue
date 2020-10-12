package com.capg;

public class Node<K> implements INode<K>{
	private INode<K> next;
	private K key;
	
	public Node(K key) {
		this.key=key;
		this.next=null;
	}
	
	public void setKey(K key) {
		this.key=key;
	}
	
	public K getKey() {
		return key;
	}
	
	public INode<K> getNext() {
		return next;
	}
	
	public void setNext(INode<K> next) {
		this.next=next;
	}

}
