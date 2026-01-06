package com.scheduling.controller;

import com.scheduling.models.Patient;
import com.scheduling.repository.PatientRepository;
import com.scheduling.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientServices patientServices;

    @GetMapping("/list")
    public List<Patient> list(){
        return patientServices.list();

    }
}
