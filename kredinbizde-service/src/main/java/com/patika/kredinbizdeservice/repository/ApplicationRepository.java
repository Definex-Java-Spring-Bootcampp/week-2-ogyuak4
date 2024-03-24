package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ApplicationRepository {


    private List<Application> applications = new ArrayList<>();

    public List<Application> findByUserEmail(String email) {
        return applications.stream()
                .filter(application -> application.getUser().getEmail().equals(email))
                .collect(Collectors.toList());
    }

    public void save(Application application) {
        applications.add(application);
    }
}
