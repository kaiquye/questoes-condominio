package com.example.demo;

import com.example.demo.questao1.CalculadoraDeArea;
import com.example.demo.questao2.Apartamento;
import com.example.demo.questao2.CalculoCondomínioPorApartamento;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);

    // questao 1
    var calculo = new CalculadoraDeArea();

    // questao 2
    var tamanhoDoApartamento = 10;
    var nomeDoApartamento = "Apartamento 1";
    var apartamento1 = new Apartamento(nomeDoApartamento, tamanhoDoApartamento);
    var tamanhoDoApartamento2 = 20;
    var nomeDoApartamento2 = "Apartamento 2";
    var apartamento2 = new Apartamento(nomeDoApartamento2, tamanhoDoApartamento2);
    var tamanhoDoApartamento3 = 20;
    var nomeDoApartamento3 = "Apartamento 3";
    var apartamento3 = new Apartamento(nomeDoApartamento3, tamanhoDoApartamento3);

    List<Apartamento> apartamentos = List.of(apartamento1, apartamento2, apartamento3);

    int despesasTotais = 1000;

    var calculoDoCondominioPorApartamento = new CalculoCondomínioPorApartamento();
    calculoDoCondominioPorApartamento.calcular(apartamentos, despesasTotais);
  }
}
