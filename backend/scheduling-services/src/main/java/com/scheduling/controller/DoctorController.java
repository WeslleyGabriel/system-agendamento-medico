package com.scheduling.controller;

import com.scheduling.models.Doctor;
import com.scheduling.repository.DoctorRepository;
import com.scheduling.services.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorServices doctorServices;

    @GetMapping("/list")
    public List<Doctor> list(){
        return doctorServices.list();

    }
}
