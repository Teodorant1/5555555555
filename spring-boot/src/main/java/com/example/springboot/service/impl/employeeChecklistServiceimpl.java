package com.example.springboot.service.impl;


import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.employeeChecklist;
import com.example.springboot.repository.employeeChecklistRepository;
import com.example.springboot.service.employeeChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class employeeChecklistServiceimpl implements employeeChecklistService {

    @Autowired
    private employeeChecklistRepository employeeChecklistRepository;
    public employeeChecklistServiceimpl (employeeChecklistRepository employeeChecklistRepository)
    {super();
    this.employeeChecklistRepository=employeeChecklistRepository;}


    @Override
    public employeeChecklist saveemployeeChecklist(employeeChecklist employeeChecklist) {
        return employeeChecklistRepository.save(employeeChecklist);
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
    public employeeChecklist updateemployeeChecklist(employeeChecklist employeeChecklist, long id) {
                employeeChecklist existingemployeechecklist = employeeChecklistRepository.
                        findById(id).orElseThrow( ()-> new ResourceNotFoundException("employeeChecklist","id",id));
                        existingemployeechecklist.setEmployee(employeeChecklist.getEmployee());
                        existingemployeechecklist.setIsChecked(employeeChecklist.getIsChecked());
                        existingemployeechecklist.setDescription(employeeChecklist.getDescription());
                        existingemployeechecklist.setCLT(employeeChecklist.getCLT());
                        existingemployeechecklist.setTimedropdown(employeeChecklist.getTimedropdown());
                        employeeChecklistRepository.save(existingemployeechecklist);
                        return existingemployeechecklist;
    }

    @Override
    public void deleteemployeeChecklist(long id) {
        employeeChecklistRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("employeeChecklist","id",id)
        );
        employeeChecklistRepository.deleteById(id);

    }
}

