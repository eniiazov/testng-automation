package mapAndComparator;

import java.util.Comparator;

public class Student {
	 int age;
	    String name;
	 int iq;
	    // Constructor
	    public Student(int age, String name,int iqs)
	                              
	    {
	        this.age = age;
	        this.name = name;
	        this.iq=iqs;
	    }

		
		@Override
		public String toString() {
			
			return this.age+" "+this.name;
		}
	  
		public int compare(Student a, Student b)
	    {
	        return a.name.compareTo(b.name);
	    }  
}
