package com.example.demo.questao2;

import java.util.List;

public class CalculoCondomínioPorApartamento {

  private Integer valorDoCodominio;

  public List<Apartamento> calcular(List<Apartamento> apartamentos, Integer despesas) {
    int tamanhoTotalDoApartamento = 0;
    for (Apartamento a : apartamentos) {
      tamanhoTotalDoApartamento += a.getTamanhoDoApartamento();
    }

    for (Apartamento apartamento : apartamentos) {
      var fracaoFinal = apartamento.getTamanhoDoApartamento() / tamanhoTotalDoApartamento;
      apartamento.setFracaoFinal(fracaoFinal);
      var valorDoCondominio = fracaoFinal * despesas;
      apartamento.setValorDoCondominio(valorDoCondominio);

      System.out.println(
          "CALCULO DO CONDOMINIO POR APARTAMENTO: Nome do apartamento:" + apartamento.getNome()
              + "Valor do condominio"
              + apartamento.getValorDoCondominio() +
              "fracao final do condominio: " + apartamento.getFracaoFinal());
    }

    return apartamentos;
  }

  public Integer getValorDoCodominio() {
    return valorDoCodominio;
  }

  public void setValorDoCodominio(Integer valorDoCodominio) {
    this.valorDoCodominio = valorDoCodominio;
  }
}
