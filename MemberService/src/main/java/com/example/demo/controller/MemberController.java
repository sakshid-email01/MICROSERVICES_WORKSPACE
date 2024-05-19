package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MemberModel;
import com.example.demo.service.ServiceInterface;

@RestController
@RequestMapping("/memberController")
public class MemberController {
	@Autowired
	ServiceInterface serviceInterface;
	
	@GetMapping("/returnMemberString")
	public ResponseEntity<String> returnString() {
		return new ResponseEntity<String>("response from api", HttpStatus.OK);
	}

	@PostMapping("/addMember")
	public ResponseEntity<Object> add(@RequestBody MemberModel model) {
		serviceInterface.create(model);
		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/findMemberByClubId/{id}")
	public ResponseEntity<List<MemberModel>> findByClubId(@PathVariable("id") int id) {		
		return new ResponseEntity<List<MemberModel>>(serviceInterface.findByClubId(id), HttpStatus.OK);
	}
}
