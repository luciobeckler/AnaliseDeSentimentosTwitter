package ImplementacaoListaDEC;

public class ListaDE {

  Celula primeiro;

  ListaDE() {
    primeiro = null;
  }

  boolean vazia() {
    return primeiro == null;
  }

  void inserirNoInicio(Celula celula) {
    if (!vazia()) {
      celula.prox = primeiro;
      primeiro.ant = celula;
    }
    primeiro = celula;
  }

  void inserirNoFinal(Celula celula) {
    if (vazia()) {
      primeiro = celula;
    } else {
      Celula aux = primeiro;
      while (aux.prox != null) {
        aux = aux.prox;
      }
      aux.prox = celula;
      celula.ant = aux;
    }
  }

  boolean removerFinal() {
    if (vazia()) {
      return false;
    } else {
      Celula aux = primeiro;
      while (aux.prox != null) {
        aux = aux.prox;
      }
      if (aux.ant != null) {
        (aux.ant).prox = null;
      }
      aux.ant = null;
      return true;
    }
  }

  void imprimir() {
    Celula aux = primeiro;
    while (aux != null) {
      System.err.println(("Valor =" + aux.valor));
      aux = aux.prox;
    }
  }
}
