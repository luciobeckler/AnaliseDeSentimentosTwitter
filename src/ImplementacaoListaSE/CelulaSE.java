package ImplementacaoListaSE;

public class CelulaSE {

    ListaSe lista;
    Tweet tweetItem;
    AnaliseLingua numeroLingua;
    CelulaSE prox;

    public CelulaSE(Tweet dado) {
        tweetItem = dado;
    }

    public CelulaSE(ListaSe dado) {
        lista = dado;
    }

    public CelulaSE(AnaliseLingua dado) {
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
