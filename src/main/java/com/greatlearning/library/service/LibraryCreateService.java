package com.greatlearning.library.service;

import java.util.List;

import com.greatlearning.library.entity.LibraryEntity;

public interface LibraryCreateService {

	String addSingleLibrary(LibraryEntity libraryEntity);

	String addAllLibrary(List<LibraryEntity> libraryEntity);

	LibraryEntity addLibraryWithSaveAndFlush(LibraryEntity libraryEntity);

}