package com.te.bill;

import java.util.Scanner;

public class input {
	static int item(int mulqty) throws OrderException {
		String[] item = { "0.Idly", "1.Dosa", "2.Chappati", "3.Roti", "4.Tea", "5.Coffee" };
		int[] price = { 20, 50, 30, 70, 15, 20 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("ITEM" + "\t\t" + "PRICE");
		for (int k = 0; k < item.length; k++) {
			System.out.println(item[k] + "\t \t" + price[k]);
		}
		System.out.println("enter the no of items");
		int noofitem = scanner.nextInt();
		if (noofitem <= item.length) {
			System.out.println("choose the items");
			int itm;
			String itmcollect[] = new String[noofitem];
			for (int j = 0; j < noofitem; j++) {
				int a = 1;
				if (noofitem >= a && a > 0) {
					itm = scanner.nextInt();
					itmcollect[j] = item[itm];
					mulqty += price[itm];
					a++;
				} else {
					break;
				}
			}
			System.out.println("YOURS ORDER ITEMS IS");
			for (int i1 = 0; i1 < itmcollect.length; i1++) {
				System.out.println(itmcollect[i1]);
			}
			return mulqty;
		} else {
			throw new OrderException("invalid choice....");
		}
	}
}
