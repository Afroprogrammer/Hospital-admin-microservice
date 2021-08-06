package com.afroprogrammer.hrservice.service;

import com.afroprogrammer.hrservice.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HrService {
    List<Employee> employees = Arrays.asList(
            new Employee("E1", "Franklin", "Oduro", "Pharmacy"),
            new Employee("E2", "Rodney", "Ace", "IT"),
            new Employee("E3", "Onesimus", "Appiah", "Medilab"),
            new Employee("E4", "Sedem", "Kwame", "Pathology")
    );

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(String Id) {
        Employee emp = employees.stream()
                .filter(x -> Id.equals(x.getId()))
                .findAny()
                .orElse(null);
        return emp;
    }
}