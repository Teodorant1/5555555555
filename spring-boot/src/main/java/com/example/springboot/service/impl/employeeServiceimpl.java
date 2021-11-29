package com.example.springboot.service.impl;

import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.employee;

import com.example.springboot.repository.employeeRepository;
import com.example.springboot.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class employeeServiceimpl implements employeeService {

    @Autowired
    private employeeRepository employeeRepository;
    public employeeServiceimpl(employeeRepository employeeRepository)
    { super();
    this.employeeRepository=employeeRepository;
    }

    @Override
    public employee saveemployee(employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<employee> getAllemployee() {
        return employeeRepository.findAll();
    }

    @Override
    public employee getemployeebyID(long id) {
        return employeeRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("employee","id",id));
    }

    @Override
    public employee updateemployee(employee employee, long id) {
       employee existingemployee = employeeRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("employee","id",id));
        existingemployee.setFirstname(employee.getFirstname());
        existingemployee.setLastname(employee.getLastname());
        existingemployee.setEmail(employee.getEmail());
        existingemployee.setSSNUMBER(employee.getSSNUMBER());
        existingemployee.setEducation(employee.getEducation());
        return existingemployee;
    }

    @Override
    public void deleteemployee(long id) {
        employeeRepository.findById(id).orElseThrow( ()->
                new ResourceNotFoundException("employee", "id", id)
        );
        employeeRepository.deleteById(id);
    }
}
