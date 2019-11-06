package com.raghavx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionMain {
/*
 * git status 
 * git add . 
 * git commit -m "message "
 * git push 
 * 
 */
	public ExceptionMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int a = 10, b = 0;
		//System.out.println(a/b);
		
		
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Object obj = null;
		obj.toString();
		

	}

}
