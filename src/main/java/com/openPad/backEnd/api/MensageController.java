package com.openPad.backEnd.api;

import com.openPad.backEnd.dots.MensageRecordDto;
import com.openPad.backEnd.models.MensageTable;
import com.openPad.backEnd.repository.MensageRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
public class MensageController {
  @Autowired
  private final MensageRepository mensageRepository;

  public MensageController(MensageRepository mensageRepository) {
      this.mensageRepository = mensageRepository;
  }

  @PostMapping
  public ResponseEntity<MensageTable> saveMensage(@RequestBody @Valid MensageRecordDto mensageDto){
    var mensageModel = new MensageTable();

    BeanUtils.copyProperties(mensageDto, mensageModel);//Cópia propiedades mensageDto -> mensageModel

    return ResponseEntity.status(HttpStatus.CREATED).body(mensageRepository.save(mensageModel));//Retorna requisição
    // com resultado do "mensageModel" salvo no banco dados
  }

  @GetMapping
  public ResponseEntity<MensageTable> obterMensage(@RequestParam("id") String id_mensage){
    var mensageTableOptional = mensageRepository.findById(id_mensage);

    //Método indicado pela Intellij
    return mensageTableOptional.map(mensageTable -> ResponseEntity.ok((MensageTable) mensageTable)).orElseGet(() -> ResponseEntity.notFound().build());

  }

}