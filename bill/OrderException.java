package com.te.bill;

public class OrderException extends RuntimeException {
	String msg;
	OrderException(String msg){
		this.msg=msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}

}
