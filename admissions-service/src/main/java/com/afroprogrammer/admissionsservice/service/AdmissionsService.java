package com.afroprogrammer.admissionsservice.service;

import com.afroprogrammer.admissionsservice.model.Patient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;

@Service
public class AdmissionsService {
    List<Patient> patients = Arrays.asList(
            new Patient("P1", "Gabor", "Humgarian"),
            new Patient("P2", "Joe", "Ghana"),
            new Patient("P3", "Franklin", "Mali"),
            new Patient("P4", "Ben", "Russia")
    );

    public List<Patient> getPatients(){
        return  patients;
    }

    public Patient getPatientById(String Id)
    {
        Patient p = patients.stream()
                .filter(patient -> Id.equals(patient.getId()))
                .findAny()
                .orElse(null);
        return p;
    }

}
