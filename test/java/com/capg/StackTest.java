package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
	@Test
	public void givenStack_WhenPushed_ShouldBeAddedToTop() {
		Node<Integer> myFirstNode = new Node<Integer>(70);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(56);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode<Integer> peek = stack.peek();
		Assert.assertEquals(myThirdNode, peek);
	}
	
	@Test
	public void givenStack_WhenPop_ShouldReturnTheTop() {
		Node<Integer> myFirstNode = new Node<Integer>(70);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(56);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		stack.printStack();
		INode<Integer> pop = stack.pop();
		Assert.assertEquals(myThirdNode, pop);
	}
}
