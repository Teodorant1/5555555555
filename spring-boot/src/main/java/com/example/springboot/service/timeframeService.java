package com.example.springboot.service;


import com.example.springboot.model.timeframe;

import java.util.List;

public interface timeframeService {
    timeframe savetimeframe (timeframe timeframe);
    List<timeframe> getAlltimeframes();
    timeframe gettimeframebyID (long id);
    timeframe updatetimeframe(timeframe timeframe, long id);
    void deletetimeframe (long id);
}
