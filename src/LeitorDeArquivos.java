import java.io.BufferedReader;
import java.io.FileReader;

import ImplementacaoLista.Celula;
import ImplementacaoLista.ListaSe;
import ImplementacaoLista.Tweet;

public class LeitorDeArquivos {
  public static ListaSe LeArquivosECriaObjetos(String caminhoArquivo) {
    ListaSe ListaTweets = new ListaSe();
    try {

      BufferedReader buffer = new BufferedReader(new FileReader(caminhoArquivo));
      String linha = buffer.readLine();
      while ((linha = buffer.readLine()) != null) {

        int corteInicialLingua = caminhoArquivo.lastIndexOf("/") + 1;
        int corteFinalLingua = caminhoArquivo.indexOf("_");
        String lingua = caminhoArquivo.substring(corteInicialLingua, corteFinalLingua);

        ListaTweets.inserirNoInicio(new Celula(CriaTweets(linha, lingua)));
      }
      buffer.close();
    } catch (Exception e) {
      System.err.println(e);
    }
    return ListaTweets;
  }

  private static Tweet CriaTweets(String linha, String lingua) {
    Long tweetId = Long.parseLong(linha.split(",")[0]);
    String handLabel = linha.split(",")[1];
    String annotatorID = linha.split(",")[2];

    return new Tweet(tweetId, handLabel, annotatorID, lingua);
  }
}
