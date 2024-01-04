package com.openPad.backEnd.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openPad.backEnd.models.MensageTable;

import java.util.Optional;

@Repository
public interface MensageRepository extends JpaRepository<MensageTable,String>{
    public Optional<MensageTable> findById(String id);
}