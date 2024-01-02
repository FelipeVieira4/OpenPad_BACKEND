package com.openPad.backEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.openPad.backEnd.models.MensagemModel;
@Repository
public interface MensagemRepository extends JpaRepository<MensagemModel,String>{}
