package com.example.springboot.repository;

import com.example.springboot.model.ItemCLT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemCLTRepository extends JpaRepository<ItemCLT,Long> {
}
