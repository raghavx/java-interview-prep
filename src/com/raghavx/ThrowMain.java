package com.raghavx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowMain {
	/**
	 * what is the difference between throw and throws
	 *  keyword in JAVA
	 *  
	 *  Throws keyword is used with method signature to declare the 
	 *  exceptions that the method might throw
	 *  
	 *  
	 */
	public ThrowMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
			throws FileNotFoundException,IOException
	
			 {
		FileReader fr = null;
		if(fr == null) {
			throw new FileNotFoundException();
		}else {
			throw new IOException();
		}
	}
	
	

}
