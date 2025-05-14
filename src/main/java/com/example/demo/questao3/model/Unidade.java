package com.example.demo.questao3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "unidade")
public class Unidade {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "numero", unique = true, nullable = false)
  private Integer numero;

  @ManyToOne
  @JoinColumn(name = "condominio_id", nullable = false)
  private Condominio condominio;

  public Unidade(Long id, Integer numero, Condominio condominio) {
    this.id = id;
    this.numero = numero;
    this.condominio = condominio;
  }

  public Unidade() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Condominio getCondominio() {
    return condominio;
  }

  public void setCondominio(Condominio condominio) {
    this.condominio = condominio;
  }
}
