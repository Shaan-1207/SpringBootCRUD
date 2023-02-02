package com.greatlearning.library.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.greatlearning.library.entity.LibraryEntity;
import com.greatlearning.library.repository.LiberaryRepo;
import com.greatlearning.library.service.ReadServiceInterface;

@Service
public class ReadService implements ReadServiceInterface {

    @Autowired
    LiberaryRepo readRepo;

    //read all books
    // List<LibraryEntity> This will list all the data avaialble in table
    @Override
	public List<LibraryEntity> getAllLiberary() {
        return readRepo.findAll();
    }

    //return library with no books
    @Override
	public List<LibraryEntity> getAllLiberaryWithNoBook() {
        LibraryEntity libWithNoBooks = new LibraryEntity();
        libWithNoBooks.setCommaSepratedBookName("");

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("commaSepratedBookName",
                        ExampleMatcher.GenericPropertyMatchers.exact())
                .withIgnorePaths("id", "authorName");
        // System.out.println("Just to demonstrate how this object looks like"+libWithNoBooks);
        Example<LibraryEntity> example = Example.of(libWithNoBooks, exampleMatcher);
        return readRepo.findAll(example);
    };

    //Return page of liberary
    @Override
	public Page<LibraryEntity> getLibraryPager() {
        Pageable firstThreeRecord = PageRequest.of(0, 5);
        return readRepo.findAll(firstThreeRecord);
    }
    @Override
	public Page<LibraryEntity> getCustomLibraryPager(int page, int size) {
        Pageable firstThreeRecord = PageRequest.of(page, size);
        return readRepo.findAll(firstThreeRecord);
    }
    @Override
	public List<LibraryEntity> getLatestAddedFirst() {
        return readRepo.findAll(Sort.by(Direction.DESC, "id"));
    }

    @Override
	public List<LibraryEntity> getCustomSortedByID(Direction dir) {
        return readRepo.findAll(Sort.by(dir, "id"));
    }
    @Override
	public List<LibraryEntity> getSortedByName() {
        return readRepo.findAll(Sort.by(Direction.DESC, "libraryName"));
    }

    @Override
	public List<LibraryEntity> getCustomSortedByName(Direction dir) {
        return readRepo.findAll(Sort.by(dir, "libraryName"));
    }

    @Override
	public Page<LibraryEntity> getLibraryPagedAndSortedByNameAndWithTheseBooks(String commaSepratedBookName){
        LibraryEntity libWithTheseBooks = new LibraryEntity();
        libWithTheseBooks.setCommaSepratedBookName(commaSepratedBookName);

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("commaSepratedBookName",
                        ExampleMatcher.GenericPropertyMatchers.exact())
                .withIgnorePaths("id", "libraryName");
        Example<LibraryEntity> example = Example.of(libWithTheseBooks, exampleMatcher);
        Pageable customPage = PageRequest.of(0, 2, Sort.by("libraryName"));
        return readRepo.findAll(example, customPage);
    }

    @Override
	public Page<LibraryEntity> getLibraryPagedAndSortedByName(){
        Pageable paged = PageRequest.of(0, 3, Sort.by("libraryName"));
        return readRepo.findAll(paged);
    }

    @Override
	public Page<LibraryEntity> getCustomLibraryPagedAndSortedByNameAndWithTheseBooks(String commaSepratedBookName, int page, int size){
        LibraryEntity libWithTheseBooks = new LibraryEntity();
        libWithTheseBooks.setCommaSepratedBookName(commaSepratedBookName);

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("commaSepratedBookName",
                        ExampleMatcher.GenericPropertyMatchers.exact())
                .withIgnorePaths("id", "libraryName");
        Example<LibraryEntity> example = Example.of(libWithTheseBooks, exampleMatcher);
        Pageable customPage = PageRequest.of(page, size, Sort.by("libraryName"));
        return readRepo.findAll(example, customPage);
    }
    @Override
	public List<LibraryEntity> getCustomLibrarySortedByNameAndWithTheseBooks(String commaSepratedBookName){
        LibraryEntity libWithTheseBooks = new LibraryEntity();
        libWithTheseBooks.setCommaSepratedBookName(commaSepratedBookName);

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("commaSepratedBookName",
                        ExampleMatcher.GenericPropertyMatchers.exact())
                .withIgnorePaths("id", "libraryName");
        Example<LibraryEntity> example = Example.of(libWithTheseBooks, exampleMatcher);
        return readRepo.findAll(example, Sort.by("libraryName"));
    }


    @Override
	public List<LibraryEntity> getLibraryByIDs(List<Integer> ids){
        return readRepo.findAllById(ids);
    }
    @Override
	public Optional<LibraryEntity> getLibraryByIDMethod(Integer id){
        return readRepo.findById(id);
    }


    @Override
	public Optional<LibraryEntity> getALibraryWithTheseBooks(String commaSepratedBookName){
        LibraryEntity libWithTheseBooks = new LibraryEntity();
        libWithTheseBooks.setCommaSepratedBookName(commaSepratedBookName);

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("commaSepratedBookName",
                        ExampleMatcher.GenericPropertyMatchers.exact())
                .withIgnorePaths("id", "libraryName");
        Example<LibraryEntity> example = Example.of(libWithTheseBooks, exampleMatcher);
        return readRepo.findOne(example);
    }

}
