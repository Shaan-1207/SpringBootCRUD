package com.greatlearning.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.entity.LibraryEntity;
import com.greatlearning.library.service.CreateServiceInterface;

@RequestMapping("/createService")
@RestController
public class CreateController {
	
	@Autowired
	CreateServiceInterface createLibrary;
	
	@PostMapping("/createLibrary")
	public String createLibrary(LibraryEntity library) {
		return createLibrary.addSingleLibrary(library);
	}
	
	@PostMapping("/addAllLibrary")
	public String createLibraryAll(@RequestBody List <LibraryEntity> library) {
		return createLibrary.addAllLibrary(library);
	}
	
	@PostMapping("/addLibraryWithSaveAndFlush")
	public LibraryEntity addLibraryWithSaveAndFlush(LibraryEntity library) {
		return createLibrary.addLibraryWithSaveAndFlush(library);
	}
	
}
