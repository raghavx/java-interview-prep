package com.raghavx;
/**
 * How to write custom exception 
 * @author raghav
 *
 */
public class BadAirQualityException extends Exception {

	public BadAirQualityException() {
		// TODO Auto-generated constructor stub
	}

	public BadAirQualityException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BadAirQualityException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public BadAirQualityException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BadAirQualityException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
