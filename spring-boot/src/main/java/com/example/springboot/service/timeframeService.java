package com.example.springboot.service;


import com.example.springboot.dto.timeframeDTO;
import com.example.springboot.model.timeframe;

import java.util.List;

public interface timeframeService {
    timeframe savetimeframe (timeframeDTO timeframeDTO);
    List<timeframe> getAlltimeframes();
    timeframe gettimeframebyID (long id);
    timeframe updatetimeframe(timeframeDTO timeframe, long id);
    void deletetimeframe (long id);
}
