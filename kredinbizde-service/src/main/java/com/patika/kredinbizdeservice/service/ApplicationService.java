// ApplicationService.java
package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicationService {

    // Mocked data
    private List<Application> applications = new ArrayList<>();

    public List<Application> getApplicationsByEmail(String email) {
        return applications.stream()
                .filter(application -> application.getUser().getEmail().equals(email))
                .collect(Collectors.toList());
    }

    public void addApplication(Application application) {
        applications.add(application);
    }
}
