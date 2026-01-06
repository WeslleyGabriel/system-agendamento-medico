package com.scheduling.services;

import com.scheduling.models.Patient;
import com.scheduling.repository.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServices {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> list(){
        return patientRepository.findAll();

    }
}
