package com.greatlearning.library.service;

import java.util.List;

import com.greatlearning.library.entity.LibraryEntity;

public interface DeleteService {

	String deleteLibrary(LibraryEntity libraryEntity);

	//Prune table, delete all record;
	String pruneTable();

	//deleteAllThese
	String deleteAllThese(List<LibraryEntity> library);

	//deleteAllInBatch()
	String deleteAllInBatch();

	//deleteByID()
	String deleteByID(Integer id);

	//deleteAllTheseInBatch
	String deleteAllTheseInBatch(List<LibraryEntity> library);

}