package com.example.springboot.service.impl;

import com.example.springboot.dto.timeframeDTO;
import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.timeframe;
import com.example.springboot.repository.timeframeRepository;
import com.example.springboot.service.timeframeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class timeframeServiceimpl implements timeframeService {
    @Autowired
    private timeframeRepository timeframeRepository;


    @Override
    public timeframe savetimeframe(timeframeDTO timeframeDTO)
    {  timeframe timeframe = new timeframe(timeframeDTO);
         timeframeRepository.save(timeframe);
         return timeframe;
    }

    @Override
    public List<timeframe> getAlltimeframes() {
        return timeframeRepository.findAll();

    }

    @Override
    public timeframe gettimeframebyID(long id) {
        return timeframeRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("timeframe","id",id));

    }

    @Override
    public timeframe updatetimeframe(timeframeDTO timeframeDTO, long id) {
        timeframe timeframe = new timeframe(timeframeDTO);
        timeframe existingtimeframe = timeframeRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("timeframe","id",id));
               existingtimeframe.setName(timeframe.getName());
               timeframeRepository.save(existingtimeframe);
        return existingtimeframe;
    }

    @Override
    public void deletetimeframe(long id) {
    timeframeRepository.findById(id).orElseThrow( ()->
            new ResourceNotFoundException("timeframe", "id", id)
    );
    timeframeRepository.deleteById(id);
    }
}
