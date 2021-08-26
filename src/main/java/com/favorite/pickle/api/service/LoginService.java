package com.favorite.pickle.api.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	boolean checkUserName(String username) {
		
		return username.equalsIgnoreCase("akash");
	}
	
	boolean checkPassword(String password) {		
		return password.equalsIgnoreCase("Dev#1330");
	}

}
