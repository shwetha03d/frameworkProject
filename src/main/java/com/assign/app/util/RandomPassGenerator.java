package com.assign.app.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
public class RandomPassGenerator {
	
	String number="1234567890";
	char sy[]= {'%','@','$','!','&','#'};
	String ch="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	
	public String generatePass() {
		String randomChar=RandomStringUtils.random(4, ch);
		String symbol=RandomStringUtils.random(1, sy);
		String no=RandomStringUtils.random(3, number);
		
		String pass=randomChar+symbol+no;
	
		return pass;
		
		
	}
	public long generatePin() {
	
		String no=RandomStringUtils.random(4, number);
		
		long pin=Long.parseLong(no);
			
		return pin;
		
		
	}

}
