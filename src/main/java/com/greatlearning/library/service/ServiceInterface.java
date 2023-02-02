package com.greatlearning.library.service;

import org.springframework.stereotype.Component;

import com.greatlearning.library.model.GreatLearning;

@Component //identify other classes, however not required in latest version of spring boot
public interface ServiceInterface {
    GreatLearning get();
    GreatLearning customInfo(String courseName, String firstName, String lastName, String courseType);
}
