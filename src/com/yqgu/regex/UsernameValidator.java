package com.yqgu.regex;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 ^                    # Start of the line
  [a-z0-9_-]	      # Match characters and symbols in the list, a-z, 0-9, underscore, hyphen
             {3,15}   # Length at least 3 characters and maximum length of 15 
 $                    # End of the line
 */
public class UsernameValidator {
	private Pattern pattern;
	private Matcher matcher;
	
	private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";
	public UsernameValidator(){
		pattern = Pattern.compile(USERNAME_PATTERN);
	}
	public boolean validate(final String username){
		matcher = pattern.matcher(username);
		return matcher.matches();
	}
	
	public static void main(String [] args) throws UnsupportedEncodingException{
		String validUsername = "andrewgyq111";
		UsernameValidator usernameValidator = new UsernameValidator();
		System.out.println(usernameValidator.validate(validUsername));
		
		String invalidUsername = "andrew@hk";
		System.out.println(usernameValidator.validate(invalidUsername));
		
	}
}
