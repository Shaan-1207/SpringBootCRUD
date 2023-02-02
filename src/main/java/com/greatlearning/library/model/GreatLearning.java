package com.greatlearning.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor //Used for constructor injection using Lombok to avoid boiler plate codes.
@NoArgsConstructor //Used for removing error from no args constructor
@Builder // Used as teleScoping Constructor

// @Slf4j
public class GreatLearning {
	private String courseName;
	private String courseType;
	private FullName instructorName;

	/*
	//Telescoping Constructor
	public GreatLearning(String courseName, String instructorName){
		this.courseName = courseName;	
		this.instructorName = instructorName;
	}
	*/

}
