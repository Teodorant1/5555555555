package com.example.springboot.repository;

import com.example.springboot.model.employeeChecklist;
import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface employeeChecklistRepository extends JpaRepository<employeeChecklist, Long> {
}
