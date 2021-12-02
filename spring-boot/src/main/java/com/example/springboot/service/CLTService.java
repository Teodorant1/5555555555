package com.example.springboot.service;

import com.example.springboot.dto.CLTDTO;
import com.example.springboot.model.CLT;


import java.util.List;

public interface CLTService {
    CLT saveCLT (CLTDTO cltDTO);
    List<CLT> getAllCLTs();
    CLT getCLTbyID (long id);
    CLT updateCLT(CLT cltDTO, long id);
    void deleteCLT (long id);
}
