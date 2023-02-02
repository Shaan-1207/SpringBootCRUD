package com.greatlearning.library.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

@Entity
public class LibraryEntity {
    
    @Id
    private int id;
    private String libraryName;
    private String commaSepratedBookName;
    
    
}
