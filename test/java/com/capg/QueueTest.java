package com.capg;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
	@Test
	public void givenQueue_WhenEnqueued_ShouldAddToQueue() {
		Node<Integer> myFirstNode = new Node<Integer>(70);
		Node<Integer> mySecondNode = new Node<Integer>(30);
		Node<Integer> myThirdNode = new Node<Integer>(56);
		Queue queue = new Queue();
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		System.out.println("Queue:");
		queue.printQueue();
		INode node = queue.dequeue();
		System.out.println("After Dequeue");
		queue.printQueue();
		Assert.assertEquals(myFirstNode, node);
	}
}
