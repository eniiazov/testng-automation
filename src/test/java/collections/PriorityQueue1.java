package collections;
import java.util.*;
public class PriorityQueue1 {
public static void main(String[] args) {
	PriorityQueue<Planets> pq = new PriorityQueue<>();
	
	Planets Jupiter = new Planets("Jupiter", 8, 6);
	Planets Earth = new Planets("Earth", 9, 5);
	Planets Saturn = new Planets("Saturn", 12, 4);
	
//	System.out.println(pq.poll());
//	pq.add(5);
//	pq.add(2);
//	pq.add(3);
//	pq.add(2);
//   pq.offer(4);
	
//	pq.offer("d");
//	pq.offer("a");
//	pq.offer("b");
//	pq.offer("cat");
	
	pq.add(Jupiter);
	pq.add(Earth);
	pq.add(Saturn);
	
	System.out.println(pq);
	
	System.out.println(pq.peek());
	System.out.println(pq.element());
	
}
}
class Planets implements Comparable<Planets>{
	
	int size;
	String name;
	int speed;
	 
	public Planets(String n, int s, int i) {
		name = n;
		size = i;
		speed = s;
		
		
	}
	
	public boolean equals(Planets other) {
		return this.speed==other.speed;
		
	}
	@Override
	public int compareTo(Planets other) {
		
		if(this.equals(other)) {
			return 0;
		} else if(speed>other.speed) {
		return 1;}
		else return -1;
	}
	public String toString() {
		return size +","+ name +","+speed;
	}
}
