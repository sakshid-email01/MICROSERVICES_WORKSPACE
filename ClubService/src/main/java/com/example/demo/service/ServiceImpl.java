package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.ClubModel;
import com.example.demo.model.MemberModel;
import com.example.demo.model.ResponseModel;
import com.example.demo.repo.Repo;

@Service
public class ServiceImpl implements ServiceInterface{
	
	@Autowired
	private Repo repo;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseModel findMembersGoingToClub(int clubId) {
		// (findByClubId in member service) + (findById in club service)
		ClubModel club = repo.findById(clubId).get();
		ResponseModel resp = new ResponseModel();
		resp.setClub(club);
		
		List<MemberModel> memberModelList = 
		restTemplate.getForObject("http://MEMBERSERVICE/memberController/findMemberByClubId/"+clubId, List.class);
		resp.setMember(memberModelList);		
		return resp;
	}

	@Override
	public void addClub(ClubModel club) {
		repo.save(club);
	}

}
