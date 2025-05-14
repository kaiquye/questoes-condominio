package com.example.demo.questao1;

public class Circulo extends FiguraGeometrica {
  private double raio;

  public Circulo(double raio) {
    this.raio = raio;
  }

  @Override
  public double calcularArea() {
    return 3.14 * raio * raio;
  }
}
