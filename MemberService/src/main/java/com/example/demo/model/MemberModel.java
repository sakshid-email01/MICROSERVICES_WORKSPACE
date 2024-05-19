package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity   // creates a table automatically in database
          // with same name as class name
@Table(name="MEMBER") // give user specific table name
public class MemberModel {
	
	@Id  // required, marks column as primary key in table
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	// provides custom column name and conditions optional
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "clubId")
	private int clubId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getclubId() {
		return clubId;
	}
	public void setclubId(int clubId) {
		this.clubId = clubId;
	}
	@Override
	public String toString() {
		return "MemberDetails [id=" + id + ", name=" + name + ", clubId=" + clubId + "]";
	}
	

}
