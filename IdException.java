package com.te.comparatorexe;

public class IdException  extends RuntimeException{
      static String msg;
	public IdException(String msg) {
	   this.msg=msg;
	}
	public String getMessage() {
		return msg; 
	}

}
