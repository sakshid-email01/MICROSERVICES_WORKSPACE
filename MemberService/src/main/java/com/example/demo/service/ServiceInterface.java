package com.example.demo.service;

import java.util.List;

import com.example.demo.model.MemberModel;

public interface ServiceInterface {
	
	public abstract void create(MemberModel model);
	public abstract List<MemberModel> findByClubId(int id);

}
