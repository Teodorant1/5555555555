package com.example.springboot.service.impl;

import com.example.springboot.dto.employeeDTO;
import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.employee;

import com.example.springboot.repository.employeeRepository;
import com.example.springboot.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class employeeServiceimpl implements employeeService {

    @Autowired
    private employeeRepository employeeRepository;


    @Override
    public employee saveemployee(employeeDTO employee1) {
        employee employee = new employee(employee1);
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
    public employee updateemployee(employeeDTO employeeDTO, long id) {
        employee existingemployee = employeeRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("employee","id",id));
        existingemployee.setFirstname(employeeDTO.getFirstname());
        existingemployee.setLastname(employeeDTO.getLastname());
        existingemployee.setEmail(employeeDTO.getEmail());
        existingemployee.setSSNUMBER(employeeDTO.getSSNUMBER());
        existingemployee.setEducation(employeeDTO.getEducation());
        employeeRepository.save(existingemployee);
        return existingemployee;}


    public employee updateemployee(employee employee, long id) {
       return employee;
    }

    @Override
    public void deleteemployee(long id) {
        employeeRepository.findById(id).orElseThrow( ()->
                new ResourceNotFoundException("employee", "id", id)
        );
        employeeRepository.deleteById(id);
    }
}
