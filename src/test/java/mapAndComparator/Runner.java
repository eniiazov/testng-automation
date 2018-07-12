package mapAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {
		 ArrayList<Student> ar = new ArrayList<Student>();
	        ar.add(new Student(11, "Kuzzat",56));
	        ar.add(new Student(13, "Muradil",67));
	        ar.add(new Student(12,"Akbar",67));
	 
	        System.out.println("Unsorted");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	 
	        Collections.sort(ar, new SortbyAge());
	 
	        System.out.println("\nSorted by age");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	 
	        Collections.sort(ar, new SortbyName());
	 
	        System.out.println("\nSorted by name");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	        Collections.sort(ar, new iq());
	   	 
	        System.out.println("\nSorted by iq");
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	 
	        
	    }
	}


