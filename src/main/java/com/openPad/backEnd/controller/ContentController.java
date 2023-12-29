package com.openPad.backEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.openPad.backEnd.repository.ContentRepository;

@RestController
public class ContentController {
  
  @Autowired
  private ContentRepository contentRepository;


}
