package com.afroprogrammer.admissionsservice.service;

import com.afroprogrammer.admissionsservice.model.DiseaseList;
import com.afroprogrammer.admissionsservice.model.EmployeesList;
import com.afroprogrammer.admissionsservice.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AdmissionsService {
    @Autowired
    private RestTemplate restTemplate;

    List<Patient> patients = Arrays.asList(
            new Patient("P1", "Gabor", "Hugarian"),
            new Patient("P2", "Joe", "Ghana"),
            new Patient("P3", "Franklin", "Mali")
    );

    public List<Patient> getPatients() {
        return patients;
    }

    public Patient getPatientById(String Id) {
        Patient patient = patients.stream()
                .filter(x -> Id.equals(x.getId()))
                .findAny()
                .orElse(null);
        return patient;
    }

    public EmployeesList getEmployees() {
        EmployeesList employeeList = restTemplate.getForObject("http://hr-service/hr/employees", EmployeesList.class);
        return employeeList;
    }

    public DiseaseList getDiseaseList() {
        DiseaseList diseaseList = restTemplate.getForObject("http://pathology-service/pathology/diseases", DiseaseList.class);
        return diseaseList;
    }
}