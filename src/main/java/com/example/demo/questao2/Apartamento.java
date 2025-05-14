package com.example.demo.questao2;

public class Apartamento {

  private String nome;
  private Integer tamanhoDoApartamento;
  private Integer fracaoFinal; // eu seto esse valor no calculo (na outra classe)
  private Integer valorDoCondominio; // eu seto esse valor no calculo (na outra classe)

  public Apartamento(String nome, Integer tamanhoDoApartamento) {
    this.nome = nome;
    this.tamanhoDoApartamento = tamanhoDoApartamento;
  }

  public Apartamento(String nome, Integer tamanhoDoApartamento, Integer fracaoFinal,
      Integer valorDoCondominio) {
    this.tamanhoDoApartamento = tamanhoDoApartamento;
    this.fracaoFinal = fracaoFinal;
    this.nome = nome;
    this.valorDoCondominio = valorDoCondominio;
  }

  public Integer getTamanhoDoApartamento() {
    return tamanhoDoApartamento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setTamanhoDoApartamento(Integer tamanhoDoApartamento) {
    this.tamanhoDoApartamento = tamanhoDoApartamento;
  }

  public Integer getFracaoFinal() {
    return fracaoFinal;
  }

  public void setFracaoFinal(Integer fracaoFinal) {
    this.fracaoFinal = fracaoFinal;
  }

  public Integer getValorDoCondominio() {
    return valorDoCondominio;
  }

  public void setValorDoCondominio(Integer valorDoCondominio) {
    this.valorDoCondominio = valorDoCondominio;
  }
}
