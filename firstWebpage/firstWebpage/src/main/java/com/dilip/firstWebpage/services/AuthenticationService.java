package com.dilip.firstWebpage.services;

import org.springframework.stereotype.Service;

@Service ///business logic is writtten in this.///
public class AuthenticationService {
	
	public boolean Authenticate(String username, String Password){
		
		boolean isValidUser= username.equalsIgnoreCase("Admin");
		boolean IsValidPassword= Password.equalsIgnoreCase("Dilip29"); 
		
		return isValidUser && IsValidPassword;
		
	}

}
