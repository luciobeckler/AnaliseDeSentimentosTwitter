

import ImplementacaoLista.ListaSe;

public class Main {
    public static void main(String[] args) {
        LeitorDeArquivos leitorDeArquivos = new LeitorDeArquivos();

        ListaSe listaAlbano = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Albanian_Twitter_sentiment.csv");
        ListaSe listaAlemao = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/German_Twitter_sentiment.csv");
        ListaSe listaRUssa = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Russian_Twitter_sentiment.csv");
        ListaSe listaServia = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Serbian_Twitter_sentiment.csv");
        ListaSe listaEspanha = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Spanish_Twitter_sentiment.csv");
        ListaSe listaBosnia = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Bosnian_Twitter_sentiment.csv");
        ListaSe listaBulgaria = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Bulgarian_Twitter_sentiment.csv");
        ListaSe listaCroacia = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Croatian_Twitter_sentiment.csv");
        ListaSe listaIngles = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/English_Twitter_sentiment.csv");
        ListaSe listahungara = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Hungarian_Twitter_sentiment.csv");
        ListaSe listaPortugues = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Portugueses_Twitter_sentiment.csv");
        ListaSe listaPolones = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Polish_Twitter_sentiment.csv");
        ListaSe listaEslovaco = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Slovak_Twitter_sentiment.csv");
        ListaSe listaEslovenia = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Slovenian_Twitter_sentiment.csv");
        ListaSe listaSueca = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Swedish_Twitter_sentiment.csv");
    }
}