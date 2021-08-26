package com.favorite.pickle.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.favorite.pickle.api.model.Pickle;
import com.favorite.pickle.api.model.UserDetails;
import com.favorite.pickle.api.service.LoginService;

@RestController

public class PickleApi {

	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/pickles")
	public List<Pickle> getPickes(@Validated @RequestBody UserDetails userDetails) {
		
		List<Pickle> pickles = new ArrayList<>();
		
		
		pickles.add( new Pickle("mango", "tangy"));
		pickles.add( new Pickle("lime", "sweet"));
		
		return pickles;
	}	
}
