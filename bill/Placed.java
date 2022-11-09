package com.te.bill;

import java.util.Scanner;

public class Placed {
	static void orderPlaced(int tot) {
		System.out.println("if you want continue your order enter yes or no");
		Scanner scanner=new Scanner(System.in);
		String ch=scanner.next();
		String ch1="yes";
		if(ch1.equals(ch)) {
			tot+=input.item(tot);
			System.out.println("YOURS BILL AMOUNT IS : "+tot);
		}
		else {
			System.out.println("THANKS FOR YOUR PLACING YOUR ORDER");
		}
		if(ch1.equalsIgnoreCase(ch))
			try {
			orderPlaced(tot);}
		 catch(OrderException o) {
    		 System.out.println(o.getMessage());
    	 }
		
	}
	
	}


