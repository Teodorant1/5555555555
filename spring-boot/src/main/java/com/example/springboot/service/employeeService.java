package com.example.springboot.service;

import com.example.springboot.dto.employeeDTO;
import com.example.springboot.model.employee;

import java.util.List;

public interface employeeService {
    employee saveemployee (employeeDTO employeeDTO);
    List<employee> getAllemployee();
    employee getemployeebyID (long id);
    employee updateemployee(employeeDTO employeeDTO, long id);
    void deleteemployee (long id);
}
