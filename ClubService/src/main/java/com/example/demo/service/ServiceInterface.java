package com.example.demo.service;

import com.example.demo.model.ClubModel;
import com.example.demo.model.ResponseModel;

public interface ServiceInterface {
	
	public abstract ResponseModel findMembersGoingToClub(int clubId);
	public abstract void addClub(ClubModel club);

}
