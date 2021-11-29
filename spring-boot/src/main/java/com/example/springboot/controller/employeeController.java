package com.example.springboot.controller;

import com.example.springboot.model.employee;
import com.example.springboot.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class employeeController
{  @Autowired
   private employeeService  employeeService;

    // build create employee REST API
    @PostMapping()
    public ResponseEntity<employee> saveemployee(@RequestBody employee employees){
        return new ResponseEntity<employee>(employeeService.saveemployee(employees), HttpStatus.CREATED);
    }

    // build get all employees REST API
    @GetMapping
    public List<employee> getAllemployee(){
        return employeeService.getAllemployee();
    }

    // build get employee by id REST API
    // http://localhost:8080/api/employees/1
    @GetMapping("{id}")
    public ResponseEntity<employee> getemployeeById(@PathVariable("id") long employeeId){
        return new ResponseEntity<employee>(employeeService.getemployeebyID(employeeId), HttpStatus.OK);
    }

    // build update employee REST API
    // http://localhost:8080/api/employees/1
    @PutMapping("{id}")
    public ResponseEntity<employee> updateemployee(@PathVariable("id") long id
            ,@RequestBody employee employee){
        return new ResponseEntity<employee>(employeeService.updateemployee(employee, id), HttpStatus.OK);
    }

    // build delete employee REST API
    // http://localhost:8080/api/employees/1
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteemployee(@PathVariable("id") long id){

        // delete employee from DB
        employeeService.deleteemployee(id);

        return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
    }

}