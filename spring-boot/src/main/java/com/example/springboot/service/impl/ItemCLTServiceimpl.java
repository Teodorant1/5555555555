package com.example.springboot.service.impl;

import com.example.springboot.dto.ItemCLTDTO;
import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.CLT;
import com.example.springboot.model.ItemCLT;
import com.example.springboot.model.timeframe;
import com.example.springboot.repository.ItemCLTRepository;
import com.example.springboot.service.CLTService;
import com.example.springboot.service.ItemCLTService;
import com.example.springboot.service.timeframeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemCLTServiceimpl implements ItemCLTService {
    @Autowired
    private ItemCLTRepository ItemCLTRepository;
    @Autowired
    private CLTService CLTService;
    @Autowired
    private timeframeService timeframeService;


    @Override
    public ItemCLT saveItemCLT(ItemCLTDTO ItemCLTDTO) {
        ItemCLT ItemCLT = new ItemCLT(ItemCLTDTO);
        CLT CLT = CLTService.getCLTbyID(ItemCLTDTO.getCltid());
        ItemCLT.setCltid(CLT);
        ItemCLTRepository.save(ItemCLT);
        timeframe timeframe = timeframeService.gettimeframebyID(ItemCLTDTO.getTimeframeid());
        ItemCLT.setTimeframeid(timeframe);
        return ItemCLT;
    }

    @Override
    public List<ItemCLT> getAllItemCLTs() {
        return ItemCLTRepository.findAll();
    }

    @Override
    public ItemCLT getItemCLTbyID(long id) {
        return ItemCLTRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("ItemCLT","id",id)
        );
    }

    @Override
    public ItemCLT updateItemCLT(ItemCLT ItemCLT, long id) {
      ItemCLT existingItemCLT = ItemCLTRepository.findById(id).orElseThrow(
              ()-> new ResourceNotFoundException("ItemCLT","id",id));

      existingItemCLT.setDescription(ItemCLT.getDescription());
      existingItemCLT.setCltid(ItemCLT.getCltid());
      existingItemCLT.setTimeframeid(ItemCLT.getTimeframeid());
      existingItemCLT.setActive(ItemCLT.getActive());
      ItemCLTRepository.save(existingItemCLT);
        return existingItemCLT;
    }

    @Override
    public void deleteItemCLT(long id) {
        ItemCLTRepository.findById(id).orElseThrow( ()->
                new ResourceNotFoundException("ItemCLT","id",id));
        ItemCLTRepository.deleteById(id);

    }
}
