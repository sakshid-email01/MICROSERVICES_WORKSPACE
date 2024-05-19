package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.MemberModel;
import java.util.List;


public interface Repo extends JpaRepository<MemberModel, Integer> {
	
	List<MemberModel> findByClubId(int clubId);

}
