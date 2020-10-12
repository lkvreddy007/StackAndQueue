package com.capg;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	@Test
	public void test() {
		Node<Integer> myFirstNode=new Node<>(70);
		Node<Integer> mySecondNode=new Node<>(30);
		Node<Integer> myThirdNode=new Node<>(56);
		MyLinkedList<Integer> linkedList =new MyLinkedList<Integer>();
		linkedList.append(myFirstNode);
		linkedList.append(mySecondNode);
		linkedList.append(myThirdNode);
		int i=linkedList.delete(56);
		Assert.assertEquals(2,i);
	}
}
