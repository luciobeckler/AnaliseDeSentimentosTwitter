import ImplementacaoLista.AnaliseLingua;
import ImplementacaoLista.Celula;
import ImplementacaoLista.ListaSe;
import ImplementacaoLista.AnaliseLingua;
import ImplementacaoLista.Tweet;

public class RespondePerguntasTp {

  ListaSe listaDeLinguagens;

  public RespondePerguntasTp(ListaSe listaDeLinguagensParametro) {
    listaDeLinguagens = listaDeLinguagensParametro;
  }

  public void respondePergunta1() {
    System.out.println("Qual o volume de tweets para cada idioma?");

    for (int i = 0; i < listaDeLinguagens.tamanho(); i++) {
      System.out.println("O idioma: "
          + listaDeLinguagens.getCelula(i).getCelulaLista().getCelula(0).getCelulaTweet().getLingua() + " tem "
          + listaDeLinguagens.getCelula(i).getCelulaLista().tamanho() + " tweets");
    }
  }

  public void respondePergunta2() {
    System.out.println("Qual o volume total de tweets positivos? E qual o volume total de tweets negativos?");
    int totalPositivos = 0;
    int totalNegativos = 0;
    for (int i = 0; i < listaDeLinguagens.tamanho(); i++) {
      for (int j = 0; j < listaDeLinguagens.getCelula(i).getCelulaLista().tamanho(); j++) {
        if (listaDeLinguagens.getCelula(i).getCelulaLista().getCelula(j).getCelulaTweet().getHandLabel()
            .equals("Positive")) {
          totalPositivos++;
        } else if (listaDeLinguagens.getCelula(i).getCelulaLista().getCelula(j).getCelulaTweet().getHandLabel()
            .equals("Negative")) {
          totalNegativos++;
        }
      }
    }
    System.out.println("Total de tweets positivos: " + totalPositivos);
    System.out.println("Total de tweets negativos: " + totalNegativos);
  }

  public void respondePergunta3() {
    System.out.println(
        "Qual o idioma com mais tweets negativos? Qual o idioma com mais tweets positivos? É possível fazer um ranking dos idiomas?");

    ListaSe analiseLingua = new ListaSe();

    for (int i = 0; i < listaDeLinguagens.tamanho(); i++) {
      ListaSe linguagemSelecionada = listaDeLinguagens.getCelula(i).getCelulaLista();

      long totalNegativos = 0;
      long totalPositivos = 0;
      long totalNeutros = 0;
      String lingua = "";

      for (long j = 0; j < linguagemSelecionada.tamanho(); j++) {
        Tweet celulaSelecionada = linguagemSelecionada.getCelula(i).getCelulaTweet();
        lingua = celulaSelecionada.getLingua();
        if (celulaSelecionada.getHandLabel().equals("Negative"))
          totalNegativos++;
        else if (celulaSelecionada.getHandLabel().equals("Positive"))
          totalPositivos++;
        else
          totalNeutros++;
      }

      analiseLingua.inserirNoFinal(new Celula(new AnaliseLingua(totalNegativos, totalPositivos, totalNeutros, lingua)));

      AnaliseLingua linguaMaisNegativa = new AnaliseLingua(0, 0, 0, "");
      AnaliseLingua linguaMaisPositiva = new AnaliseLingua(0, 0, 0, "");

      for (int k = 0; k < analiseLingua.tamanho(); i++) {
        if (analiseLingua.getCelula(k).getCelulaPositivosNegativosLingua().getNumeroDeNegativos() > linguaMaisNegativa
            .getNumeroDeNegativos())
          linguaMaisNegativa = analiseLingua.getCelula(k).getCelulaPositivosNegativosLingua();

        if (analiseLingua.getCelula(k).getCelulaPositivosNegativosLingua().getNumeroDePositivos() > linguaMaisNegativa
            .getNumeroDePositivos())
          linguaMaisNegativa = analiseLingua.getCelula(k).getCelulaPositivosNegativosLingua();
      }

      System.err
          .println("A lingua com o maior número de tweets positivos é: " + linguaMaisPositiva.getNumeroDePositivos());
      System.err
          .println("A lingua com o maior número de tweets negativos é: " + linguaMaisPositiva.getNumeroDeNegativos());

    }
  }

  public void respondePergunta4() {
    System.out.println("Algum tweeter teve registro em mais de um idioma? Qual, quais e/ou quantos?");
    ListaSe tweeters = new ListaSe();
    for (int i = 0; i < listaDeLinguagens.tamanho(); i++) {
      for (int j = 0; j < listaDeLinguagens.getCelula(i).getCelulaLista().tamanho(); j++) {
        Tweet tweet = listaDeLinguagens.getCelula(i).getCelulaLista().getCelula(j).getCelulaTweet();
        if (tweeters.tamanho() == 0) {
          tweeters.inserirNoFinal(new Celula(tweet));
        } else {
          boolean tweeterJaRegistrado = false;
          for (int k = 0; k < tweeters.tamanho(); k++) {
            Tweet tweeter = tweeters.getCelula(k).getCelulaTweet();
            if (tweeter.getAnnotatorID().equals(tweet.getAnnotatorID())) {
              tweeterJaRegistrado = true;
              break;
            }
          }
          if (!tweeterJaRegistrado) {
            tweeters.inserirNoFinal(new Celula(tweet));
          }
        }
      }
    }
    for (int i = 0; i < tweeters.tamanho(); i++) {
      System.out.println("Tweeter: " + tweeters.getCelula(i).getCelulaTweet().getAnnotatorID());
    }
  }

}

// 1) Qual o volume de tweets para cada idioma?
// 2) Qual o volume total de tweets positivos? E qual o volume total de tweets
// negativos?
// 3) Qual o idioma com mais tweets negativos? Qual o idioma com mais tweets
// positivos? É
// possível fazer um ranking dos idiomas?
// 4) Algum tweeter teve registro em mais de um idioma? Qual, quais e/ou
// quantos?
