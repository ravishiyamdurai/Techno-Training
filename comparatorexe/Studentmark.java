package com.te.comparatorexe;

import java.util.Comparator;

public class Studentmark implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.stdmark-o2.stdmark;
	}

}
