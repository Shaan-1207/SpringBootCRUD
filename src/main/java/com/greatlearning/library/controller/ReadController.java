package com.greatlearning.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.entity.LibraryEntity;
import com.greatlearning.library.service.ReadServiceInterface;

@RestController
@RequestMapping("/readLibrary")
public class ReadController {
	
	@Autowired
	ReadServiceInterface readLibrary;
	
	@GetMapping("/getAllLiberary")	
	private List<LibraryEntity> getAllLiberary() {
		// TODO Auto-generated method stub
		return readLibrary.getAllLiberary();
	}
	
	@GetMapping("/getAllLiberaryWithNoBook")	
	private List<LibraryEntity> getAllLiberaryWithNoBook() {
		// TODO Auto-generated method stub
		return readLibrary.getAllLiberaryWithNoBook();
	}

	@GetMapping("/getLibraryPager")	
	private Page<LibraryEntity> getLibraryPager() {
		// TODO Auto-generated method stub
		return readLibrary.getLibraryPager();
	}
	
	@GetMapping("/getCustomLibraryPager")	
	private Page<LibraryEntity> getCustomLibraryPager(int page, int size) {
		// TODO Auto-generated method stub
		return readLibrary.getCustomLibraryPager(page,size);
	}
	
	@GetMapping("/getLatestAddedFirst")	
	private List<LibraryEntity> getLatestAddedFirst() {
		// TODO Auto-generated method stub
		return readLibrary.getLatestAddedFirst();
	}
	
	@GetMapping("/getCustomSortedByID")	
	private List<LibraryEntity> getCustomSortedByID(Direction dir) {
		// TODO Auto-generated method stub
		return readLibrary.getCustomSortedByID(dir);
	}
	
	@GetMapping("/getSortedByName")	
	private List<LibraryEntity> getSortedByName() {
		// TODO Auto-generated method stub
		return readLibrary.getSortedByName();
	}
	
	@GetMapping("/getCustomSortedByName")	
	private List<LibraryEntity> getCustomSortedByName(Direction dir) {
		// TODO Auto-generated method stub
		return readLibrary.getCustomSortedByName(dir);
	}
	
	@PostMapping("/getLibraryByIDs")	
	private List<LibraryEntity> getLibraryByIDs(@RequestBody List<Integer> ids) {
		// TODO Auto-generated method stub
		return readLibrary.getLibraryByIDs(ids);
	}
	
	@GetMapping("/getCustomLibraryPagedAndSortedByNameAndWithTheseBooks")	
	private Page<LibraryEntity> getCustomLibraryPagedAndSortedByNameAndWithTheseBooks(String commaSepratedBookName, int page,
			int size) {
		// TODO Auto-generated method stub
		return readLibrary.getCustomLibraryPagedAndSortedByNameAndWithTheseBooks(commaSepratedBookName, page, size);
	}
	
	
}
