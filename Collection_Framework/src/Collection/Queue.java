package Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {
		//1. ArrayDeque
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.offerFirst(1);
		dq.addFirst(2);//add leement from head
		dq.offerLast(10);//add element from tail
		dq.addLast(20);
		System.out.println(dq);
		
		//2. PriorityQueue
		PriorityQueue<Integer> p1 = new PriorityQueue<>();
		p1.add(10);
		p1.add(5);
		p1.add(20);
		System.out.println(p1.peek());//return smallest element(Priority Low -> High)
		p1.poll();//remove 0 index element which is 5
		System.out.println(p1.peek());
	}
}
