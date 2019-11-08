package com.raghavx.exceptions;

import java.io.IOException;

public class MultipleExceptionHandling {

	public MultipleExceptionHandling() {

	}

	public void badAirQualityException() throws BadAirQualityException {
		throw new BadAirQualityException();
	}

	public void iOException() throws IOException {
		throw new IOException();
	}

	public static void main(String[] args) {
		MultipleExceptionHandling meh = new MultipleExceptionHandling();
		try {
			meh.badAirQualityException();
			meh.iOException();
		} catch (BadAirQualityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			meh.badAirQualityException();
			meh.iOException();
		} catch (BadAirQualityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
