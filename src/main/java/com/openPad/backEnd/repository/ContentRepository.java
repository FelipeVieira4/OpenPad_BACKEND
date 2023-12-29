package com.openPad.backEnd.repository;

import javax.swing.text.html.parser.ContentModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<ContentModel,String>{}
