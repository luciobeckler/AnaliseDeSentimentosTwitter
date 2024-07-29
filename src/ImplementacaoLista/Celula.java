package ImplementacaoLista;

public class Celula {

    ListaSe lista;
    Tweet tweetItem;
    Celula prox;

    public Celula(Tweet dado) {
        tweetItem = dado;
    }

    public Celula(ListaSe dado) {
        lista = dado;
    }

    public ListaSe getCelulaLista() {
        return lista;
    }

    public Tweet getCelulaTweet() {
        return tweetItem;
    }

}
