package com.greatlearning.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.serviceimpl.LibraryService;

//@Controller
@RestController
public class SpringBootController {

	@Autowired // autowired anotation handle the object creation
	LibraryService liberaryService;

	@GetMapping("/info")
	public GreatLearning get() {
		return liberaryService.get();
	}

	@PostMapping("/customInfo")
	public GreatLearning customInfo(String courseName, String firstName, String lastName, String courseType) {
		return liberaryService.customInfo(courseName, firstName, lastName, courseType);
	}

	/*
	 * //Moving Below methods to Service Package
	 * 
	 * @GetMapping("/info")
	 * // @ResponseBody (will be used if we are not using @RestController Annotation
	 * public GreatLearning get() {
	 * GreatLearning gl = new GreatLearning();
	 * gl.setCourseName("Spring Boot Tutorial");
	 * // gl.setInstructorName("Great Learning wale ustad");
	 * gl.setCourseType("Information Technology");
	 * return gl;
	 * }
	 * 
	 * @PostMapping("/customInfo")
	 * public GreatLearning customInfo(String courseName, String instructorName,
	 * String courseType) {
	 * GreatLearning gl = new GreatLearning();
	 * gl.setCourseName(courseName);
	 * gl.setCourseType(courseType);
	 * // gl.setInstructorName(instructorName);
	 * return gl;
	 * }
	 */
}
