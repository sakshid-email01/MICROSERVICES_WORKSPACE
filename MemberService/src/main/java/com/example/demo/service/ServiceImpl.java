package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MemberModel;
import com.example.demo.repo.Repo;

@Service
public class ServiceImpl implements ServiceInterface{
	
	@Autowired
	Repo repo;

	@Override
	public void create(MemberModel model) {
		// TODO Auto-generated method stub
		repo.save(model);
	}

	@Override
	public List<MemberModel> findByClubId(int id) {
		
		return repo.findByClubId(id);
	}

//	@Override
//	public Collection<Model> read() {
//		// TODO Auto-generated method stub
//		return (Collection<Model>) repo.findAll();
//	}
//
//	@Override
//	public void update(Model model) {
//		repo.save(model);
//	}
//
//	@Override
//	public void delete(int id) {
//	    repo.deleteById(id);	
//	}

}
