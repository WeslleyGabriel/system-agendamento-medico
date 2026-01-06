package com.scheduling.controller;

import com.scheduling.models.Consultation;
import com.scheduling.repository.ConsultationRepository;
import com.scheduling.services.ConsultationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consultation")
public class ConsultationController {

    @Autowired
    private ConsultationServices consultationServices;

    @GetMapping("/list")
    public List<Consultation> list(){
        return consultationServices.list();
    }
}
