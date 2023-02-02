package com.greatlearning.library.service;

public interface LibraryExist {

	boolean checkLibraryExistbyID(Integer id);

	boolean checkLibraryWithbookNameByExample(String commaSepratedBookName);

}