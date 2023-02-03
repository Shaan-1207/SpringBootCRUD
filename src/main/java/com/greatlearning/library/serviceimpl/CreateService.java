package com.greatlearning.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.library.entity.LibraryEntity;
import com.greatlearning.library.repository.LiberaryRepo;
import com.greatlearning.library.service.CreateServiceInterface;
import com.greatlearning.library.service.LibraryCreateService;

@Service
public class CreateService implements LibraryCreateService, CreateServiceInterface {

    @Autowired
    LiberaryRepo libraryRepo;

    @Override
	public String addSingleLibrary(LibraryEntity libraryEntity){
        libraryRepo.save(libraryEntity);
        libraryRepo.flush();
        return "Library Saved" ;
    }

    @Override
	public String addAllLibrary(List<LibraryEntity> libraryEntity){
        libraryRepo.saveAll(libraryEntity);
        libraryRepo.flush();
        return "All Libraries are Saved" ;
    }

    @Override
	public LibraryEntity addLibraryWithSaveAndFlush(LibraryEntity libraryEntity){
        return  libraryRepo.saveAndFlush(libraryEntity);
    }

    
}
