package com.example.springboot.service;

import com.example.springboot.dto.ItemCLTDTO;
import com.example.springboot.model.ItemCLT;

import java.util.List;

public interface ItemCLTService {
    ItemCLT saveItemCLT (ItemCLTDTO ItemCLTDTO);
    List<ItemCLT> getAllItemCLTs();
    ItemCLT getItemCLTbyID (long id);
    ItemCLT updateItemCLT(ItemCLT ItemCLTDTO, long id);
    void deleteItemCLT (long id);
}
