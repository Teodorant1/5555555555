package com.example.springboot.repository;

import com.example.springboot.model.CLT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CLTRepository extends JpaRepository<CLT, Long> {
}
