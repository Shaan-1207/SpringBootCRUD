package com.greatlearning.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.service.LibraryCountService;


@RestController
@RequestMapping("/countService")
public class CountServiceController {
	
	@Autowired
	LibraryCountService countService;
	
	
	@GetMapping("/getCountOfLibrary")
	public long countService() {
		return countService.getCountOfLibrary();
	}
	
	@GetMapping("/getCountOfLibraryWithNoBooks")
	public long countServiceWithZeroBooks() {
		return countService.countLibraryWithNoBooks();
	}
}
