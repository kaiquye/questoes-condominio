package com.example.demo.questao3.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "condominio")
public class Condominio {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "nome", nullable = false, unique = true)
  private String nome;

  @OneToMany(mappedBy = "condominio")
  private Set<Unidade> unidadeList;

  public Condominio(Long id, String nome, Set<Unidade> unidadeList) {
    this.id = id;
    this.nome = nome;
    this.unidadeList = unidadeList;
  }

  public Condominio() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Unidade> getUnidadeList() {
    return unidadeList;
  }

  public void setUnidadeList(Set<Unidade> unidadeList) {
    this.unidadeList = unidadeList;
  }
}
