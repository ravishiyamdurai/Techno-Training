package com.te.comparatorexe;

import java.util.Comparator;

public class Studentage implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.stdage-o2.stdage;
	}

}
