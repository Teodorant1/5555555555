package com.example.springboot.service;

import com.example.springboot.model.employeeChecklist;

import java.util.List;

public interface employeeChecklistService {
    employeeChecklist saveemployeeChecklist(employeeChecklist employeeChecklist);
    List<employeeChecklist> getAllemployeeChecklist();
    employeeChecklist getemployeeChecklistbyID (long id);
    employeeChecklist updateemployeeChecklist(employeeChecklist employeeChecklist, long id);
    void deleteemployeeChecklist (long id);
}
