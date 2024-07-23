import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import ImplementacaoLista.ListaSe;

public class LeitorDeArquivos {
  public static ListaSe LeArquivosECriaObjetos(String caminhoArquivo) {
    try {
      BufferedReader buffer = new BufferedReader(new FileReader(caminhoArquivo));
      String linha = buffer.readLine();
      while ((linha = buffer.readLine()) != null) {
        Tweet tweet = CriaTweets(linha);
      }
      buffer.close();
    } catch (Exception e) {
      System.err.println(e);
    }

    return new ListaSe();
  }

  private static Tweet CriaTweets(String linha) {
    return new Tweet(0, linha, linha);
  }
}
