package mapAndComparator;

import java.util.Comparator;

public class SortbyAge implements Comparator<Student>{
	@Override
	 public int compare(Student a, Student b)
	    {
	        return a.age - b.age;
	    }
	
}

