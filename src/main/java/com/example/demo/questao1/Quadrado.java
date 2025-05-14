package com.example.demo.questao1;

public class Quadrado extends FiguraGeometrica {

  private Integer lado;

  @Override
  public double calcularArea() {
    return 0;
  }

  public Quadrado(Integer lado) {
    this.lado = lado;
  }

  public Integer getLado() {
    return lado;
  }

  public void setLado(Integer lado) {
    this.lado = lado;
  }
}
