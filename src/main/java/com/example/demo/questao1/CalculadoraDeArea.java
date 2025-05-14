package com.example.demo.questao1;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeArea {

  public CalculadoraDeArea() {
    List<FiguraGeometrica> figuraGeometricalista  = new ArrayList<>();

    figuraGeometricalista.add(new Quadrado(2));
    figuraGeometricalista.add(new Circulo(1));

    var total = 0;
    for (FiguraGeometrica figura : figuraGeometricalista) {
      total += figura.calcularArea();
    }

    System.out.println("Total calculado: " + total);
  }
}
