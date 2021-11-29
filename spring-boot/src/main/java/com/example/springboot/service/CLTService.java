package com.example.springboot.service;

import com.example.springboot.model.CLT;


import java.util.List;

public interface CLTService {
    CLT saveCLT (CLT clt);
    List<CLT> getAllCLTs();
    CLT getCLTbyID (long id);
    CLT updateCLT(CLT clt, long id);
    void deleteCLT (long id);
}
