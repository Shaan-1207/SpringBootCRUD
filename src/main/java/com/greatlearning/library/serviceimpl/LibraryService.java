package com.greatlearning.library.serviceimpl;

import org.springframework.stereotype.Service;

import com.greatlearning.library.model.FullName;
import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.service.ServiceInterface;

import lombok.extern.slf4j.Slf4j;

/*
 * @Service consist of business logic
 **/
@Service
@Slf4j  //Logger anotation
public class LibraryService implements ServiceInterface {

	@Override
	public GreatLearning get() {
		log.info("Inside get() Method");
		GreatLearning gl = new GreatLearning();
		gl.setCourseName("Spring Boot Tutorial");
		gl.setInstructorName(FullName.builder()
				.firstName("Smarth")
				.lastName("Narula")
				.build());
		gl.setCourseType("Information Technology");
		return gl;
	}

	@Override
	public GreatLearning customInfo(String courseName, String firstName, String lastName, String courseType) {
		GreatLearning gl = new GreatLearning();
		log.info("Inside customInfo() Method");
		gl.setCourseName(courseName);
		gl.setCourseType(courseType);
		gl.setInstructorName(FullName.builder().firstName("Anupreet").lastName("Bedi").build());
		return gl;
	}


}
