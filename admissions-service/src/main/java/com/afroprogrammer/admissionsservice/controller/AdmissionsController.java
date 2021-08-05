package com.afroprogrammer.admissionsservice.controller;

import com.afroprogrammer.admissionsservice.model.Patient;
import com.afroprogrammer.admissionsservice.service.AdmissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/admissions")
public class AdmissionsController {

@Autowired
    AdmissionsService admissionsService;
    @GetMapping("/patients")
    public List<Patient> getPatients(){
        return  admissionsService.getPatients();
    }

    @GetMapping("/patients/{Id}")
    public Patient getPatientById(@PathVariable("Id") String Id){
       return admissionsService.getPatientById("Id");
    }
}
