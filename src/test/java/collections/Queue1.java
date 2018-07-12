package collections;
import java.util.*;
public class Queue1 {
public static void main(String[] args) {
	
	Queue<String> q = new LinkedList<>();
	System.out.println(q.poll());
	q.add(null);
	q.offer("a");
	q.add("");
	q.offer("d");
	
	System.out.println(q.peek());
	System.out.println(q.element());
	q.remove();
	System.out.println(q);
	q.poll();
			System.out.println(q);
			q.offer("s");
			System.out.println(q);
			System.out.println(q.size());
			System.out.println(q.remove("c"));
			System.out.println(q);
}
}
