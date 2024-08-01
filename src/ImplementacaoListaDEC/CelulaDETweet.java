package ImplementacaoListaDEC;

import ImplementacaoListaSE.Tweet;

public class CelulaDETweet extends Celula {

  Tweet valor;
  CelulaDETweet prox;
  CelulaDETweet ant;

  public CelulaDETweet(Tweet dado) {
    valor = dado;
  }

}
