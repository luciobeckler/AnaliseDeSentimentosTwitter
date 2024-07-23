//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import ImplementacaoLista.ListaSe;

public class Main {
    public static void main(String[] args) {
        LeitorDeArquivos leitorDeArquivos = new LeitorDeArquivos();

        ListaSe listaAlbano = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Albanian_Twitter_sentiment.csv");
        ListaSe listaAlemao = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/German_Twitter_sentiment.csv");

    }
}