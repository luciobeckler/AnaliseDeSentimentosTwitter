package ImplementacaoLista;

public class ListaSEC {
  Celula primeiro;

  public boolean vazio() {
    return primeiro == null;
  }

  public boolean removerNoInicio() {
    if (vazio()) {
      System.out.println("Lista já estava vazia");
      return false;
    }
    primeiro = primeiro.prox;
    return true;
  }
}
