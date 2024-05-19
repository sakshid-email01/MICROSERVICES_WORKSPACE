package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity   // creates a table automatically in database
          // with same name as class name
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CLUB") // give user specific table name
public class ClubModel {
	
	@Id  // required, marks column as primary key in table
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	// provides custom column name and conditions optional
	private int id;
	
	@Column(name = "clubName")
	private String clubName;
	

}
