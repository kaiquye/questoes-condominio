package com.example.demo.questao4.controller.dtos;

public class CreateMoradorDtoRequest {

  private String nome;
  private String sobrenome;

  public CreateMoradorDtoRequest(String nome, String sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  public CreateMoradorDtoRequest() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }
}
