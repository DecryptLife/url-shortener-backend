package com.urlbackend.service;

import org.springframework.stereotype.Service;

@Service
public class URLServiceImplementation implements URLService {
	
	private static final String stringDict = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private char[] characterDict = stringDict.toCharArray();
	private int base = characterDict.length;
	
	
	@Override
	public String long2short(String long_url) {
		// TODO Auto-generated method stub
		
		long input = 1023345;
		StringBuilder encoded = new StringBuilder();
		
		while(input > 0)
		{
			encoded.append(characterDict[(int) (input%base)]);
			input /= base;
		}
		
		
		return encoded.reverse().toString();
	}
}
