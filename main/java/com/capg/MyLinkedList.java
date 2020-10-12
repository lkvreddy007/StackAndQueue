package com.capg;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	int size=0;
	
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void setHead(INode<K> head) {
		this.head=head;
	}
	
	public INode<K> getHead() {
		return this.head;
	}
	
	public void add(INode<K> node) {
		if(this.tail==null) {
			this.tail=node;
		}
		if(this.head==null) {
			this.head=node;
		}
		else {
			INode<K> tempNode=this.head;
			this.head=node;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode<K> node) {
		if(this.tail==null) {
			this.tail=node;
		}
		if(this.head==null) {
			this.head=node;
		}
		else {
			this.tail.setNext(node);
			this.tail=node;
		}
	}
	
	public int size() {
		INode<K> temp=head;
		while(temp!=null) {
			size=size+1;
			temp=temp.getNext();
		}
		return size;
	}
	
	public void insert(INode<K> previousNode, INode<K> newNode,INode<K> nextNode) {
		previousNode.setNext(newNode);
		newNode.setNext(nextNode);
	}
	
	public void insertInMid(INode<K> node) {
		if(this.tail==null) {
			this.tail=node;
		}
		if(this.head==null) {
			this.head=node;
		}
		else {
			int mid=size()/2;
			int i=0;
			INode<K> temp=this.head;
			while(i++!=mid) {
				temp=temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
	}
	
	public void print() {
		INode<K> x=this.head;
		if(x==null) {
			System.out.println("Linked list is Empty");
		}
		while(x!=null) {
			System.out.println(x.getKey());
			x=x.getNext();
		}
	}
	
	public void insertAfter(K prevKey,K key) {
		INode<K> temp=head;
		Node<K> newNode =new Node<K>(key);
		if(temp==null) {
			return;
		}
		while(!(temp.getKey().equals(prevKey))) {
				temp=temp.getNext();
			}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		adjustTail();
		print();
	}
	
	public INode<K> popFirst() {
		INode<K> temp=this.head;
		this.head=head.getNext();
		return temp;
	}
	
	public INode<K> popLast(){
		INode<K> temp=head;
		while(temp.getNext()!=tail) {
			temp=temp.getNext();
		}
		tail=temp;
		temp=temp.getNext();
		tail.setNext(null);
		return temp;
	}	
  
	public boolean search(K key) {
		INode<K> temp = head;
		while (temp != null) {
			if (temp.getKey().equals(key)) {
				System.out.println("Element found");
				return true;
			} else
				temp = temp.getNext();
		}
		return false;
	}
	
	public int delete(K key) {
		INode<K> temp=head;
		if(temp==null) {
			return 0;
		}
		while(!((temp.getNext()).getKey().equals(key))) {
			temp=temp.getNext();
		}
		temp.setNext((temp.getNext()).getNext());
		print();
		int i=size();
		System.out.println("Size after Deletion is "+i);
		adjustTail();
		return i;
	}
	
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
  
	public void adjustTail() {
		INode<K> node=this.head;
		while(!(node==null)) {
			this.tail=node;
			node=node.getNext();
		}
	}
}
