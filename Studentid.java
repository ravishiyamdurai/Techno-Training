package com.te.comparatorexe;

import java.util.Comparator;

public class Studentid implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.stdid-o2.stdid;
	}
	

}
