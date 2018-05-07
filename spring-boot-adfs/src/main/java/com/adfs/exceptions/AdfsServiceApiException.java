package com.adfs.exceptions;

import org.springframework.http.HttpStatus;

/**
 * @author Pkalashetty
 *
 */
public class AdfsServiceApiException extends RuntimeException{

	
	private static final long serialVersionUID = 1502324943831481315L;

	private String errorCode;
	private String errorMessage;
	private HttpStatus httpStatus;
	
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	
	
	
}
