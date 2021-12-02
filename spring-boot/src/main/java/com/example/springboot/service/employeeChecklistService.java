package com.example.springboot.service;

import com.example.springboot.dto.employeeChecklistDTO;
import com.example.springboot.model.employeeChecklist;

import java.util.List;

public interface employeeChecklistService {
    employeeChecklist saveemployeeChecklist(employeeChecklistDTO employeeChecklistDTO);
    List<employeeChecklist> getAllemployeeChecklist();
    employeeChecklist getemployeeChecklistbyID (long id);
    employeeChecklist updateemployeeChecklist(employeeChecklistDTO employeeChecklistDTO, long id);
    void deleteemployeeChecklist (long id);
}
