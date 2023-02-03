package com.greatlearning.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.entity.LibraryEntity;
import com.greatlearning.library.serviceimpl.DeleteLibrary;

@RestController
@RequestMapping("/deleteLibrary")
public class DeleteController {
	
	@Autowired
	DeleteLibrary deleteLibrary;
	
	
	@DeleteMapping("/deleteSingleLibrary")
	public String deleteOneLibrary(LibraryEntity library) {
		return deleteLibrary.deleteLibrary(library);
	}
	@DeleteMapping("/deleteByID")
	public String deleteByID(Integer id) {
		return deleteLibrary.deleteByID(id);
	}
	
	@DeleteMapping("/deleteAllTheseLibrary")
	public String deleteAllThese(@RequestBody List<LibraryEntity> library) {
		return deleteLibrary.deleteAllThese(library);
	}
	
	@DeleteMapping("/pruneTable")
	public String pruneTable() {
		return deleteLibrary.pruneTable();
	}

	@DeleteMapping("/deleteAllInBatch")
	public String deleteAllInBatch() {
		return deleteLibrary.deleteAllInBatch();
	}	
	
	@DeleteMapping("/deleteAllTheseInBatch")
	public String deleteAllTheseInBatch(@RequestBody List<LibraryEntity> library) {
		return deleteLibrary.deleteAllTheseInBatch(library);
	}
}
