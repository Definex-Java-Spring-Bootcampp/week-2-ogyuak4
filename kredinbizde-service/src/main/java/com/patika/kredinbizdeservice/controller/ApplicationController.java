package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/user/{email}")
    public List<Application> getApplicationsByEmail(@PathVariable String email) {
        return applicationService.getApplicationsByEmail(email);
    }

    @PostMapping("/loan")
    public ResponseEntity<String> applyForLoan(@RequestBody Application application) {
        applicationService.applyForLoan(application);
        return ResponseEntity.status(HttpStatus.CREATED).body("Loan application başarıyla kaydedildi.");
    }
}
