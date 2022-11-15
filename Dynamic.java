package com.te.comparatorexe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Dynamic {
	static HashSet<Student> arrayList;
	static String b;
	static String ch;
	static Scanner scanner = new Scanner(System.in);
	static Student student;
	static int id;
	static ArrayList<Student> l1;

	static void dynamicinput() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the id");
		id = scanner.nextInt();
		System.out.println("enter the name");
		String name = scanner.next();
		System.out.println("enter the age");
		int age = scanner.nextInt();
		System.out.println("enter the mark");
		int mark = scanner.nextInt();

		arrayList.add(new Student(id, name, age, mark));
	}

	public static void disp() {
		System.out.println("1.sorted ny id");
		System.out.println("2.sorted ny name");
		System.out.println("3.sorted ny age");
		System.out.println("4.sorted ny mark");
		System.out.println("enter the number 1 to 4");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			Collections.sort(l1, new Studentid());
			System.out.println("*****after sorting by student id******");
			for (Student std : l1) {
				System.out.println(std);
			}
			break;
		case 2:
			Collections.sort(l1, new Studentname());
			System.out.println("*****after sorting by student name****");
			for (Student std : l1) {
				System.out.println(std);
			}
			break;
		case 3:
			Collections.sort(l1, new Studentage());
			System.out.println("*****after sorting by student age****");
			for (Student std : l1) {
				System.out.println(std);
			}
			break;
		case 4:
			Collections.sort(l1, new Studentmark());
			System.out.println("*****after sorting by student mark****");
			for (Student std : l1) {
				System.out.println(std);
			}
			break;
		default:
			System.out.println("invalid number");
		}
	}

	public static void main(String[] args) {
		arrayList = new HashSet<Student>();
		System.out.println("*************Welcome to student list*************");
		dynamicinput();
		do {
			System.out.println("if you want add the element enter yes otherwise enter no");
			b = scanner.next();
			ch = "yes";
			if (ch.equalsIgnoreCase(b)) {
				dynamicinput();
			} else {
				System.out.println("end");
			}
		} while (ch.equalsIgnoreCase(b));
		for (Student string : arrayList) {
			System.out.println(string);
		}
		l1 = new ArrayList<Student>(arrayList);
		System.out.println("if you want sorting enter yes otherwise enter no");
		do {
			System.out.println("if you want sorting enter yes otherwise enter no");
			b = scanner.next();
			ch = "yes";
			if (ch.equalsIgnoreCase(b)) {
				disp();
			} else {
				System.out.println("Thank you");
			}
		} while (ch.equalsIgnoreCase(b));

	}
}
