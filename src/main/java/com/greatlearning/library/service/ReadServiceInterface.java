package com.greatlearning.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.library.entity.LibraryEntity;

public interface ReadServiceInterface {

	//read all books
	// List<LibraryEntity> This will list all the data avaialble in table
	List<LibraryEntity> getAllLiberary();

	//return library with no books
	List<LibraryEntity> getAllLiberaryWithNoBook();

	//Return page of liberary
	Page<LibraryEntity> getLibraryPager();

	Page<LibraryEntity> getCustomLibraryPager(int page, int size);

	List<LibraryEntity> getLatestAddedFirst();

	List<LibraryEntity> getCustomSortedByID(Direction dir);

	List<LibraryEntity> getSortedByName();

	List<LibraryEntity> getCustomSortedByName(Direction dir);

	Page<LibraryEntity> getLibraryPagedAndSortedByNameAndWithTheseBooks(String commaSepratedBookName);

	Page<LibraryEntity> getLibraryPagedAndSortedByName();

	Page<LibraryEntity> getCustomLibraryPagedAndSortedByNameAndWithTheseBooks(String commaSepratedBookName, int page,
			int size);

	List<LibraryEntity> getCustomLibrarySortedByNameAndWithTheseBooks(String commaSepratedBookName);

	List<LibraryEntity> getLibraryByIDs(List<Integer> ids);

	Optional<LibraryEntity> getLibraryByIDMethod(Integer id);

	Optional<LibraryEntity> getALibraryWithTheseBooks(String commaSepratedBookName);

}