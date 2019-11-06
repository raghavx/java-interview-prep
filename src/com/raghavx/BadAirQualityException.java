package com.raghavx;
/**
 * How to write custom exception 
 * @author raghav
 *
 *
 *	What is OutOFMemoryError 
 *	-Xms2048m & -Xmx512m
 */
public class BadAirQualityException extends Exception {

	public BadAirQualityException() {
		// TODO Auto-generated constructor stub
	}

	public BadAirQualityException(String message) {
		super(message);

	}

	public BadAirQualityException(Throwable cause) {
		super(cause);
	}

	public BadAirQualityException(String message, Throwable cause) {
		super(message, cause);
	}

	public BadAirQualityException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
