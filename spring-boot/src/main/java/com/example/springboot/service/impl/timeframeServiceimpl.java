package com.example.springboot.service.impl;

import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.timeframe;
import com.example.springboot.repository.timeframeRepository;
import com.example.springboot.service.timeframeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class timeframeServiceimpl implements timeframeService {
    @Autowired
    private timeframeRepository timeframeRepository;
    public timeframeServiceimpl(timeframeRepository timeframeRepository)
    { super();
    this.timeframeRepository=timeframeRepository;}

    @Override
    public timeframe savetimeframe(timeframe timeframe) {
        return timeframeRepository.save(timeframe);
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
    public timeframe updatetimeframe(timeframe timeframe, long id) {
        timeframe existingtimeframe = timeframeRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("CLT","id",id));
               existingtimeframe.setName(timeframe.getName());
        return existingtimeframe;
    }

    @Override
    public void deletetimeframe(long id) {
    timeframeRepository.findById(id).orElseThrow( ()->
            new ResourceNotFoundException("CLT", "id", id)
    );
    timeframeRepository.deleteById(id);
    }
}
