package com.te.bill;

import java.util.Scanner;

public class main {
     public static void main(String[] args) {
    	 try {
		int tot=input.item(0);
		System.out.println("YOURS BILL AMOUNT IS : "+tot);
		Placed.orderPlaced(tot);
    	 }
    	 catch(OrderException o) {
    		 System.out.println(o.getMessage());
    	 }
		
		
	}

}
