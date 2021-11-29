package com.example.springboot.controller;

import com.example.springboot.model.ItemCLT;
import com.example.springboot.service.ItemCLTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ItemCLT")
public class ItemCLTController {
    @Autowired
    private ItemCLTService ItemCLTService;

    // build create ItemCLT REST API
    @PostMapping()
    public ResponseEntity<ItemCLT> saveItemCLT(@RequestBody ItemCLT ItemCLT){
        return new ResponseEntity<ItemCLT>(ItemCLTService.saveItemCLT(ItemCLT), HttpStatus.CREATED);
    }

    // build get all ItemCLT REST API
    @GetMapping
    public List<ItemCLT> getAllItemCLTs(){
        return ItemCLTService.getAllItemCLTs();
    }

    // build get ItemCLT by id REST API
    // http://localhost:8080/api/ItemCLT/1
    @GetMapping("{id}")
    public ResponseEntity<ItemCLT> getItemCLTById(@PathVariable("id") long ItemCLTId){
        return new ResponseEntity<ItemCLT>(ItemCLTService.getItemCLTbyID(ItemCLTId), HttpStatus.OK);
    }

    // build update ItemCLT REST API
    // http://localhost:8080/api/ItemCLT/1
    @PutMapping("{id}")
    public ResponseEntity<ItemCLT> updateItemCLT(@PathVariable("id") long id
            ,@RequestBody ItemCLT ItemCLT){
        return new ResponseEntity<ItemCLT>(ItemCLTService.updateItemCLT(ItemCLT, id), HttpStatus.OK);
    }

    // build delete ItemCLT REST API
    // http://localhost:8080/api/ItemCLT/1
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteItemCLT(@PathVariable("id") long id){

        // delete ItemCLT from DB
        ItemCLTService.deleteItemCLT(id);

        return new ResponseEntity<String>("Item deleted successfully!.", HttpStatus.OK);
    }
}
