package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ClubModel;
import com.example.demo.model.ResponseModel;
import com.example.demo.service.ServiceInterface;

@RestController
@RequestMapping("/clubController")
public class ClubController {
	
	@Autowired
	ServiceInterface serviceInterface;

//create an api which will return the list of members going to a particular club (findByClubId in memberservice)
//along with info of that club (findById in clubservice)
// soln: (findByClubId in memberservice) + (findById in clubservice)
	

	@PostMapping("/add")
	public ResponseEntity<String> addClub(@RequestBody ClubModel club) {
		serviceInterface.addClub(club);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/findMembersGoingToClub/{clubId}")
	public ResponseEntity<ResponseModel> findMembersGoingToClub(@PathVariable int clubId) {
		
		return new ResponseEntity<>(serviceInterface.findMembersGoingToClub(clubId), HttpStatus.OK);
	}
	
	
}
