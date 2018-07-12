package mapAndComparator;

import java.util.Comparator;

public class iq implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		 return o2.age - o1.age;
	}

}
