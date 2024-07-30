package ImplementacaoLista;

public class Celula {

    ListaSe lista;
    Tweet tweetItem;
    AnaliseLingua numeroLingua;
    Celula prox;

    public Celula(Tweet dado) {
        tweetItem = dado;
    }

    public Celula(ListaSe dado) {
        lista = dado;
    }

    public Celula(AnaliseLingua dado) {
        numeroLingua = dado;
    }

    public ListaSe getCelulaLista() {
        return lista;
    }

    public Tweet getCelulaTweet() {
        return tweetItem;
    }

    public AnaliseLingua getCelulaPositivosNegativosLingua() {
        return numeroLingua;
    }

}
