package com.example.springboot.service.impl;

import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.CLT;
import com.example.springboot.repository.CLTRepository;
import com.example.springboot.service.CLTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CLTServiceimpl implements CLTService {
    @Autowired
    private CLTRepository CLTRepository;
    public CLTServiceimpl (CLTRepository cltRepository)
    {super();
    this.CLTRepository=cltRepository;}


    @Override
    public CLT saveCLT(CLT clt) {
        return CLTRepository.save(clt);
    }

    @Override
    public List<CLT> getAllCLTs() {
        return CLTRepository.findAll();
    }

    @Override
    public CLT getCLTbyID(long id) {
        return CLTRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("CLT","id",id));
    }

    @Override
    public CLT updateCLT(CLT clt, long id) {
        CLT existingclt = CLTRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("CLT","id",id));
        existingclt.setDescription(clt.getDescription());
        existingclt.setType(clt.getType());
        CLTRepository.save(existingclt);
        return existingclt;
    }

    @Override
    public void deleteCLT(long id) {
        CLTRepository.findById(id).orElseThrow( ()->
                new ResourceNotFoundException("CLT", "id", id)
        );
        CLTRepository.deleteById(id);
    }
}
