//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import ImplementacaoLista.ListaSe;

public class Main {
    public static void main(String[] args) {
        LeitorDeArquivos leitorDeArquivos = new LeitorDeArquivos();

        // Leitura de arquivos e criação de objetos
        ListaSe listaDeLinguagens = new ListaSe();

        ListaSe listaAlbano = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Albanian_Twitter_sentiment.csv");
        ListaSe listaBosnian = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Bosnian_Twitter_sentiment.csv");
        ListaSe listaBulgarian = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Bulgarian_Twitter_sentiment.csv");
        ListaSe listaCroatian = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Croatian_Twitter_sentiment.csv");
        ListaSe listaEnglish = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/English_Twitter_sentiment.csv");
        ListaSe listaGerman = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/German_Twitter_sentiment.csv");
        ListaSe listaHungarian = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Hungarian_Twitter_sentiment.csv");
        ListaSe listaPolish = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Polish_Twitter_sentiment.csv");
        ListaSe listaPortuguese = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Portuguese_Twitter_sentiment.csv");
        ListaSe listaRussian = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Russian_Twitter_sentiment.csv");
        ListaSe listaSerbian = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Serbian_Twitter_sentiment.csv");
        ListaSe listaSlovak = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Slovak_Twitter_sentiment.csv");
        ListaSe listaSlovenian = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Slovenian_Twitter_sentiment.csv");
        ListaSe listaSpanish = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Spanish_Twitter_sentiment.csv");
        ListaSe listaSwedish = leitorDeArquivos.LeArquivosECriaObjetos("src/Data/Swedish_Twitter_sentiment.csv");
        // Escrever todas as listas

        // Programa esta crashando aqui, necessário otimizar o código para parar de
        // travar
        // Cortar estas linhas e adicionar a linha comentada no leitor de arquivos para
        // testar

    }
}