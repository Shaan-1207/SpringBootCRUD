package com.greatlearning.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.greatlearning.library.entity.LibraryEntity;

@Repository
public interface LiberaryRepo extends JpaRepository<LibraryEntity, Integer>{
    
}
