package com.greatlearning.library.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.greatlearning.library.entity.LibraryEntity;
import com.greatlearning.library.repository.LiberaryRepo;
import com.greatlearning.library.service.LibraryExist;

@Service
public class LibraryExistServiceImp implements LibraryExist {
	
	@Autowired
	LiberaryRepo liberaryRepo;
	
	@Override
	public boolean checkLibraryExistbyID(Integer id) {
		return liberaryRepo.existsById(id);
	}
	
	@Override
	public boolean checkLibraryWithbookNameByExample(String commaSepratedBookName) {
		LibraryEntity library = new LibraryEntity();
		library.setCommaSepratedBookName(commaSepratedBookName);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("commaSepratedBookName", 
						ExampleMatcher.GenericPropertyMatchers.exact()).withIgnorePaths("libraryName", "id");

		Example<LibraryEntity> example = Example.of(library, exampleMatcher);
		return liberaryRepo.exists(example);
	}
}
