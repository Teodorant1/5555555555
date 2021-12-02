package com.example.springboot.controller;

import com.example.springboot.dto.timeframeDTO;
import com.example.springboot.model.timeframe;
import com.example.springboot.service.timeframeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/timeframe")
public class timeframeController {
    @Autowired
    private timeframeService timeframeService;


    // build create timeframe REST API
    @PostMapping()
    public ResponseEntity<timeframe> savetimeframe(@RequestBody timeframeDTO timeframeDTO){
        return new ResponseEntity<timeframe>
                (timeframeService.savetimeframe(timeframeDTO), HttpStatus.CREATED);
    }

    // build get all timeframe REST API
    @GetMapping
    public List<timeframe> getAlltimeframes(){
        return timeframeService.getAlltimeframes();
    }

    // build get timeframe by id REST API
    // http://localhost:8080/api/timeframe/1
    @GetMapping("{id}")
    public ResponseEntity<timeframe> gettimeframeById(@PathVariable("id") long timeframeId){
        return new ResponseEntity<timeframe>(timeframeService.gettimeframebyID(timeframeId), HttpStatus.OK);
    }

    // build update timeframe REST API
    // http://localhost:8080/api/timeframe/1
    @PutMapping("{id}")
    public ResponseEntity<timeframe> updatetimeframe(@PathVariable("id") long id
            ,@RequestBody timeframeDTO timeframeDTO){
                return new ResponseEntity<timeframe>
                        (timeframeService.updatetimeframe(timeframeDTO, id), HttpStatus.OK);
    }

    // build delete timeframe REST API
    // http://localhost:8080/api/timeframe/1
    @DeleteMapping("{id}")
    public ResponseEntity<String> deletetimeframe(@PathVariable("id") long id){

        // delete timeframe from DB
        timeframeService.deletetimeframe(id);

        return new ResponseEntity<String>("timeframe deleted successfully!.", HttpStatus.OK);
    }
}
