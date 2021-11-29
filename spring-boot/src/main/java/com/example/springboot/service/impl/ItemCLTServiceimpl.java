package com.example.springboot.service.impl;

import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.ItemCLT;
import com.example.springboot.repository.ItemCLTRepository;
import com.example.springboot.service.ItemCLTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemCLTServiceimpl implements ItemCLTService {
    @Autowired
    private ItemCLTRepository ItemCLTRepository;
    public ItemCLTServiceimpl ( ItemCLTRepository itemCLTRepository )
    {super();
    this.ItemCLTRepository=itemCLTRepository;}

    @Override
    public ItemCLT saveItemCLT(ItemCLT ItemCLT) {
        return ItemCLTRepository.save(ItemCLT) ;
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
        return existingItemCLT;
    }

    @Override
    public void deleteItemCLT(long id) {
        ItemCLTRepository.findById(id).orElseThrow( ()->
                new ResourceNotFoundException("ItemCLT","id",id));
        ItemCLTRepository.deleteById(id);

    }
}
