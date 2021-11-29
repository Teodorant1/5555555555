package com.example.springboot.controller;

import com.example.springboot.model.employeeChecklist;
import com.example.springboot.service.employeeChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employeeChecklist")
public class employeeChecklistController
{   @Autowired
    private employeeChecklistService employeeChecklistService;

    // build create employeeChecklist REST API
    @PostMapping()
    public ResponseEntity<employeeChecklist> saveemployeeChecklist(@RequestBody employeeChecklist employeeChecklist){
        return new ResponseEntity<employeeChecklist>(employeeChecklistService.saveemployeeChecklist(employeeChecklist), HttpStatus.CREATED);
    }

    // build get all employeeChecklists REST API
    @GetMapping
    public List<employeeChecklist> getAllemployeeChecklists(){
        return employeeChecklistService.getAllemployeeChecklist();
    }

    // build get employeeChecklist by id REST API
    // http://localhost:8080/api/employeeChecklists/1
    @GetMapping("{id}")
    public ResponseEntity<employeeChecklist> getemployeeChecklistById(@PathVariable("id") long employeeChecklistId){
        return new ResponseEntity<employeeChecklist>(employeeChecklistService.getemployeeChecklistbyID(employeeChecklistId), HttpStatus.OK);
    }

    // build update employeeChecklist REST API
    // http://localhost:8080/api/employeeChecklists/1
    @PutMapping("{id}")
    public ResponseEntity<employeeChecklist> updateemployeeChecklist(@PathVariable("id") long id
            ,@RequestBody employeeChecklist employeeChecklist){
        return new ResponseEntity<employeeChecklist>(employeeChecklistService.updateemployeeChecklist(employeeChecklist, id), HttpStatus.OK);
    }

    // build delete employeeChecklist REST API
    // http://localhost:8080/api/employeeChecklists/1
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteemployeeChecklist(@PathVariable("id") long id){

        // delete employeeChecklist from DB
        employeeChecklistService.deleteemployeeChecklist(id);

        return new ResponseEntity<String>("EmployeeChecklist deleted successfully!.", HttpStatus.OK);
    }

}
