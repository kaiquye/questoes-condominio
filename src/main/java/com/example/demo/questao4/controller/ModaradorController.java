package com.example.demo.questao4.controller;

import com.example.demo.questao4.controller.dtos.CreateMoradorDtoRequest;
import com.example.demo.questao4.controller.dtos.CreateMoradorDtoResponse;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morador")
public class ModaradorController {

  @PostMapping()
  public ResponseEntity<CreateMoradorDtoResponse> create(
      @RequestBody CreateMoradorDtoRequest body
  ) {
    return new ResponseEntity(new CreateMoradorDtoResponse(1L), HttpStatus.CREATED);
  }

  @GetMapping()
  public ResponseEntity<List<CreateMoradorDtoResponse>> list() {
    return new ResponseEntity(List.of(new CreateMoradorDtoResponse(1L)), HttpStatus.OK
    );
  }
}
