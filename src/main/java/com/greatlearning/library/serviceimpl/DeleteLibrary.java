package com.greatlearning.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.library.entity.LibraryEntity;
import com.greatlearning.library.repository.LiberaryRepo;
import com.greatlearning.library.service.DeleteService;

@Service
public class DeleteLibrary implements DeleteService{
	
	@Autowired
	LiberaryRepo deleteLibrary;
	
	@Override
	public String deleteLibrary(LibraryEntity libraryEntity) {
		deleteLibrary.delete(libraryEntity);		
		return "Library Deleted" + libraryEntity;
	}

	//Prune table, delete all record;
	@Override
	public String pruneTable() {
		deleteLibrary.deleteAll();
		return "All records has been deleted";
	}
	
	//deleteAllThese
	@Override
	public String deleteAllThese(List<LibraryEntity> library) {
		deleteLibrary.deleteAll(library);
		return "Delete all these records" + library;
	}
	
	//deleteAllInBatch()
	@Override
	public String deleteAllInBatch() {
		deleteLibrary.deleteAllInBatch();
		return "Delete all in batch:";
	}
	//deleteByID()
	@Override
	public String deleteByID(Integer id) {
		deleteLibrary.deleteById(id);
		return "Delete by ID "+ id;
	}
	
	//deleteAllTheseInBatch
	@Override
	public String deleteAllTheseInBatch(List<LibraryEntity> library) {
		deleteLibrary.deleteInBatch(library);
		return "Delete all these in Batch" + library;
	}
	
}
