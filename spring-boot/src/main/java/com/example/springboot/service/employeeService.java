package com.example.springboot.service;

import com.example.springboot.model.employee;

import java.util.List;

public interface employeeService {
    employee saveemployee (employee employee);
    List<employee> getAllemployee();
    employee getemployeebyID (long id);
    employee updateemployee(employee employee, long id);
    void deleteemployee (long id);
}
