package com.scheduling.services;

import com.scheduling.models.Doctor;
import com.scheduling.models.Patient;
import com.scheduling.repository.DoctorRepository;
import com.scheduling.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServices {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> list(){
        return doctorRepository.findAll();

    }
}
