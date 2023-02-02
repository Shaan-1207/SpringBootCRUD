package com.greatlearning.library.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.greatlearning.library.entity.LibraryEntity;
import com.greatlearning.library.repository.LiberaryRepo;
import com.greatlearning.library.service.LibraryCountService;

@Service
public class CountService implements LibraryCountService {
	
	@Autowired
	LiberaryRepo countRepo;
	
	@Override
	public long getCountOfLibrary(){	
		return countRepo.count();
	}
	
	@Override
	public long countLibraryWithNoBooks() {
		LibraryEntity library = new LibraryEntity();
		library.setCommaSepratedBookName("");
		ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("commaSepratedBookName", 
						ExampleMatcher.GenericPropertyMatchers.exact()).withIgnorePaths("libraryName", "id");

		Example<LibraryEntity> example = Example.of(library, exampleMatcher);
		return countRepo.count(example);
	}

}
