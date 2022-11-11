package com.te.comparatorexe;

public class Student {
	int stdid;
	String stdname;
	int stdage;
	int stdmark;
	public Student(int stdid, String stdname, int stdage, int stdmark) {
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdage = stdage;
		this.stdmark = stdmark;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdage=" + stdage + ", stdmark=" + stdmark + "]";
	}
	
	

}
