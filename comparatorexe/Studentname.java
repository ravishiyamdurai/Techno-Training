package com.te.comparatorexe;

import java.util.Comparator;

public class Studentname implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.stdname.compareTo(o2.stdname);
	}
	

}
