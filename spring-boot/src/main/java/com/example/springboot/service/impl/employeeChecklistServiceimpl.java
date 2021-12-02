package com.example.springboot.service.impl;


import com.example.springboot.dto.employeeChecklistDTO;
import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.CLT;
import com.example.springboot.model.employee;
import com.example.springboot.model.employeeChecklist;
import com.example.springboot.repository.employeeChecklistRepository;
import com.example.springboot.service.CLTService;
import com.example.springboot.service.employeeChecklistService;
import com.example.springboot.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeChecklistServiceimpl implements employeeChecklistService {

    @Autowired
    private employeeChecklistRepository employeeChecklistRepository;
    @Autowired
    private employeeService employeeService;
    @Autowired
    private CLTService CLTService;


    public employeeChecklist saveemployeeChecklist(employeeChecklist employeeChecklist) {
        return null;
    }

    @Override
    public employeeChecklist saveemployeeChecklist(employeeChecklistDTO employeeChecklistDTO) {
        employeeChecklist employeeChecklist = new employeeChecklist(employeeChecklistDTO);
        employeeChecklistRepository.save(employeeChecklist);
        return employeeChecklist;

    }

    @Override
    public List<employeeChecklist> getAllemployeeChecklist() {
return  employeeChecklistRepository.findAll();    }

    @Override
    public employeeChecklist getemployeeChecklistbyID(long id) {
        return employeeChecklistRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("employeeChecklist","id",id));
    }

    @Override
    public employeeChecklist updateemployeeChecklist(employeeChecklistDTO employeeChecklistDTO, long id) {
        employeeChecklist existingemployeechecklist = employeeChecklistRepository.
                findById(id).orElseThrow( ()-> new ResourceNotFoundException("employeeChecklist","id",id));
        employee employee = employeeService.getemployeebyID(employeeChecklistDTO.getEmployeeid());
        CLT CLT = CLTService.getCLTbyID(employeeChecklistDTO.getCltid());
        existingemployeechecklist.setEmployee(employee);
        existingemployeechecklist.setIsChecked(employeeChecklistDTO.getIsChecked());
        existingemployeechecklist.setDescription(employeeChecklistDTO.getDescription());
        existingemployeechecklist.setCLT(CLT);
        existingemployeechecklist.setTimedropdown(employeeChecklistDTO.getTimedropdown());
        employeeChecklistRepository.save(existingemployeechecklist);
        return existingemployeechecklist;
    }


    public employeeChecklist updateemployeeChecklist(employeeChecklist employeeChecklist, long id) {
        return null;
    }

    @Override
    public void deleteemployeeChecklist(long id) {
        employeeChecklistRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("employeeChecklist","id",id)
        );
        employeeChecklistRepository.deleteById(id);

    }
}

