package collections;
import java.util.*;
public class Deque1 {
public static void main(String[] args) {
	Deque<String> d = new LinkedList<>();
	d.add("jupiter");
	d.addFirst("earth");
	d.addLast("mars");;
	d.addFirst("neptune");
	System.out.println(d);
	System.out.println(d.getLast());
	System.out.println(d.pollLast());
	System.out.println(d);
	System.out.println(d.removeLast());
	System.out.println(d.peekLast());
	
}
}
