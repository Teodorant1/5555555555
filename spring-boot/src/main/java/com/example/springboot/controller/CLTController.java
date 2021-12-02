package com.example.springboot.controller;

import com.example.springboot.dto.CLTDTO;
import com.example.springboot.model.CLT;
import com.example.springboot.service.CLTService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/CLT")
public class CLTController {

    private com.example.springboot.service.CLTService CLTService;
    public CLTController(com.example.springboot.service.CLTService CLTService) {
        super();
        this.CLTService = CLTService;
    }
    // build create CLT REST API
    @PostMapping()
    public ResponseEntity<CLT> saveCLT(@RequestBody CLTDTO CLTDTO){
          CLT CLT = new CLT(CLTDTO);
        return  new ResponseEntity<CLT>(CLTService.saveCLT(CLTDTO), HttpStatus.CREATED);

    }

    // build get all CLT REST API
    @GetMapping
    public List<CLT> getAllCLTs(){
        return CLTService.getAllCLTs();
    }

    // build get CLT by id REST API
    // http://localhost:8080/api/CLT/1
    @GetMapping("{id}")
    public ResponseEntity<CLT> getCLTById(@PathVariable("id") long CLTId){
        return new ResponseEntity<CLT>(CLTService.getCLTbyID(CLTId), HttpStatus.OK);
    }

    // build update CLT REST API
    // http://localhost:8080/api/CLT/1
    @PutMapping("{id}")
    public ResponseEntity<CLT> updateCLT(@PathVariable("id") long id
            ,@RequestBody CLT CLT){
        return new ResponseEntity<CLT>(CLTService.updateCLT(CLT, id), HttpStatus.OK);
    }

    // build delete CLT REST API
    // http://localhost:8080/api/CLT/1
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCLT(@PathVariable("id") long id){

        // delete CLT from DB
        CLTService.deleteCLT(id);

        return new ResponseEntity<String>("CLT deleted successfully!.", HttpStatus.OK);
    }
}
