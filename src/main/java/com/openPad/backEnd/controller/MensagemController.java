package com.openPad.backEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.openPad.backEnd.repository.MensagemRepository;

@RestController
public class MensagemController {
  
  @Autowired
  private MensagemRepository contentRepository;

}
