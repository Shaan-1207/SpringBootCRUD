package com.greatlearning.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.service.LibraryExist;

@RestController
@RequestMapping("/libraryExist")
public class LibraryExistController {
	
	@Autowired 
	LibraryExist existService;
	
	
	@GetMapping("/checkLibraryExistbyID")
	private boolean checkLibraryExistbyID(Integer id) {
		return existService.checkLibraryExistbyID(id);
	}
	
	@GetMapping("/checkLibraryWithbookNameByExample")
	private boolean checkLibraryWithbookNameByExample(String commaSepratedBookName) {
		return existService.checkLibraryWithbookNameByExample(commaSepratedBookName);
	}
	
	

}
