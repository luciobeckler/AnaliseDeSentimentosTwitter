import java.io.BufferedReader;
import java.io.FileReader;

import ImplementacaoListaSE.CelulaSE;
import ImplementacaoListaSE.ListaSe;
import ImplementacaoListaSE.Tweet;

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

        Tweet tweet = CriaTweets(linha, lingua);
        CelulaSE celula = new CelulaSE(tweet);

        ListaTweets.inserirNoInicio(celula);
      }
      buffer.close();
    } catch (Exception e) {
      System.err.println(e);
    }
    // ListaTweets.imprimir();
    return ListaTweets;
  }

  private static Tweet CriaTweets(String linha, String lingua) {
    String[] linhaSplit = linha.split(",");

    Long tweetId = Long.parseLong(linhaSplit[0]);
    String handLabel = linhaSplit[1];
    String annotatorID = linhaSplit[2];

    return new Tweet(tweetId, handLabel, annotatorID, lingua);
  }
}
