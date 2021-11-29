package com.example.springboot.service;

import com.example.springboot.model.ItemCLT;

import java.util.List;

public interface ItemCLTService {
    ItemCLT saveItemCLT (ItemCLT ItemCLT);
    List<ItemCLT> getAllItemCLTs();
    ItemCLT getItemCLTbyID (long id);
    ItemCLT updateItemCLT(ItemCLT ItemCLT, long id);
    void deleteItemCLT (long id);
}
