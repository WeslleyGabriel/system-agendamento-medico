package com.scheduling.services;

import com.scheduling.models.Consultation;
import com.scheduling.models.Patient;
import com.scheduling.repository.ConsultationRepository;
import com.scheduling.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationServices {

    @Autowired
    private ConsultationRepository consultationRepository;

    public List<Consultation> list(){
        return consultationRepository.findAll();
    }
}
