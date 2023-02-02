package com.greatlearning.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //Used for constructor injection using Lombok to avoid boiler plate codes.
@NoArgsConstructor //Used for removing error from no args constructor
@Builder // Used as teleScoping Constructor
public class FullName {
    private String firstName;
    private String lastName;
}

