package com.afroprogrammer.hrservice.controller;


import com.afroprogrammer.hrservice.model.Employee;
import com.afroprogrammer.hrservice.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hr")
public class HrController {
    @Autowired
    HrService hrService;
    @GetMapping ("/employees")
    public List<Employee> getEmployees(){
        return hrService.getAllEmployees();
    }

    @GetMapping("/employee/{Id}")
    public Employee getEmployeeById(@PathVariable("Id") String Id){
        return hrService.getEmployeeById(Id);
    }
}
