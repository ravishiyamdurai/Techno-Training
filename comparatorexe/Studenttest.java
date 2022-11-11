package com.te.comparatorexe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Studenttest {
	static ArrayList<Student> arrayList;
	static String b;
	static String ch;
	 static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		Student student = new Student(20, "shyam", 25, 100);
		Student student1 = new Student(10, "ravi", 50, 95);
		Student student2 = new Student(50, "raj", 40, 65);
		Student student3 = new Student(40, "kala", 27, 40);
		Student student4 = new Student(30, "prathi", 24, 98);
	     arrayList=new ArrayList<Student>();
		arrayList.add(student);
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		System.out.println("before sorting");
       for(Student std:arrayList) {
    	   System.out.println(std);
       }
    	   
           do {
        	  System.out.println("if you want sorting enter yes otherwise enter no");
              b=scanner.next();
              ch="yes";
              if(ch.equalsIgnoreCase(b)) {
              disp();
              }else {
            	  System.out.println("Thank you"); 
              }
           }while(ch.equalsIgnoreCase(b));
           
       }
      public static void disp() {
       System.out.println("1.sorted ny id");
       System.out.println("2.sorted ny name");
       System.out.println("3.sorted ny age");
       System.out.println("4.sorted ny mark");
       System.out.println("enter the number 1 to 4");
       int a=scanner.nextInt();
       switch (a) {
       case 1:
       Collections.sort(arrayList, new Studentid());
       System.out.println("*****after sorting by student id******");
       for(Student std:arrayList) {
    	   System.out.println(std);
       }
       break;
       case 2:
       Collections.sort(arrayList, new Studentname());
       System.out.println("*****after sorting by student name****");
       for(Student std:arrayList) {
    	   System.out.println(std);
       }
       break;
       case 3:
       Collections.sort(arrayList, new Studentage());
       System.out.println("*****after sorting by student age****");
       for(Student std:arrayList) {
    	   System.out.println(std);
       }
       break;
       case 4:
       Collections.sort(arrayList, new Studentmark());
       System.out.println("*****after sorting by student mark****");
       for(Student std:arrayList) {
    	   System.out.println(std);
       }
       break;
       default:
    	   System.out.println("invalid number");
       }
       }
       
	}


