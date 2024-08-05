import java.nio.channels.Pipe.SourceChannel;

import ImplementacaoListaSE.AnaliseLingua;
import ImplementacaoListaSE.CelulaSE;
import ImplementacaoListaSE.ListaSe;
import ImplementacaoListaSE.ResultadoAnalise;
import ImplementacaoListaSE.AnaliseLingua;
import ImplementacaoListaSE.Tweet;

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

    ResultadoAnalise resultadoAnalise = new ResultadoAnalise();
    long tamanhoLinguagens = listaDeLinguagens.tamanho();
    for (int i = 0; i < tamanhoLinguagens; i++) {
      ListaSe linguagemSelecionada = listaDeLinguagens.getCelula(i).getCelulaLista();
      long tamanhoLinguagemSelecionada = linguagemSelecionada.tamanho();

      long totalNegativos = 0;
      long totalPositivos = 0;
      long totalNeutros = 0;
      String lingua = "";

      for (int j = 0; j < tamanhoLinguagemSelecionada; j++) {
        Tweet celulaSelecionada = linguagemSelecionada.getCelula(j).getCelulaTweet();
        lingua = celulaSelecionada.getLingua();
        if (celulaSelecionada.getHandLabel().equals("Negative"))
          totalNegativos++;
        else if (celulaSelecionada.getHandLabel().equals("Positive"))
          totalPositivos++;
        else
          totalNeutros++;
      }
      AnaliseLingua analise = new AnaliseLingua(totalNegativos, totalPositivos, totalNeutros, lingua);
      resultadoAnalise.inserirNoInicio(analise);
      System.out.println("processado");
    }

    ResultadoAnalise analiseTemporaria = new ResultadoAnalise(resultadoAnalise);
    ResultadoAnalise analiseTemporaria2 = new ResultadoAnalise(resultadoAnalise);

    ResultadoAnalise analiseOrdenadaNegativos = new ResultadoAnalise();
    ResultadoAnalise analiseOrdenadaPositivos = new ResultadoAnalise();

    while (analiseTemporaria.tamanho() != 0) {
      long maiorNegativo = 0;
      int posicao = 0;

      AnaliseLingua analiseNegativa = null;

      for (int indexAnalise = 0; indexAnalise < analiseTemporaria.tamanho(); indexAnalise++) {
        AnaliseLingua lang = analiseTemporaria.get(indexAnalise);
        long negativo = lang.getNumeroDeNegativos();

        if (maiorNegativo < negativo) {

          maiorNegativo = negativo;
          posicao = indexAnalise;
          analiseNegativa = lang;
        }
      }

      AnaliseLingua analise = new AnaliseLingua(analiseNegativa.getNumeroDeNegativos(),
          analiseNegativa.getNumeroDePositivos(),
          analiseNegativa.getNumeroDeNeutros(), analiseNegativa.getLingua());
      analiseOrdenadaNegativos.inserirNoInicio(analise);

      analiseTemporaria.removerNoMeio(posicao);

    }

    while (analiseTemporaria2.tamanho() != 0) {
      long maiorPositivo = 0;
      int posicao = 0;

      AnaliseLingua analisePositiva = null;

      for (int indexAnalise = 0; indexAnalise < analiseTemporaria2.tamanho(); indexAnalise++) {
        AnaliseLingua lang = analiseTemporaria2.get(indexAnalise);
        long positivo = lang.getNumeroDePositivos();

        if (maiorPositivo < positivo) {
          maiorPositivo = positivo;
          posicao = indexAnalise;
          analisePositiva = lang;
        }
      }
      AnaliseLingua analise = new AnaliseLingua(analisePositiva.getNumeroDeNegativos(),
          analisePositiva.getNumeroDePositivos(),
          analisePositiva.getNumeroDeNeutros(), analisePositiva.getLingua());
      analiseOrdenadaPositivos.inserirNoInicio(analise);

      analiseTemporaria2.removerNoMeio(posicao);

    }

    System.out.println("O idioma com mais tweets negativos: " + analiseOrdenadaNegativos.get(0).getLingua());
    System.out.println("O idioma com mais tweets positivos: " + analiseOrdenadaPositivos.get(0).getLingua());

    System.out.println("RANK POSITIVOS");
    for (int i = 0; i < analiseOrdenadaPositivos.tamanho(); i++) {
      AnaliseLingua analisePositiva = analiseOrdenadaPositivos.get(i);

      System.out.println(analisePositiva.getLingua() + " " + (i + 1) + " lugar" + " positivos: "
          + analisePositiva.getNumeroDePositivos());
    }

    System.out.println("RANK NEGATIVOS");
    for (int i = 0; i < analiseOrdenadaNegativos.tamanho(); i++) {
      AnaliseLingua analiseNegativa = analiseOrdenadaNegativos.get(i);

      System.out.println(analiseNegativa.getLingua() + " " + (i + 1) + " lugar" + " negativos: "
          + analiseNegativa.getNumeroDeNegativos());
    }

  }

  public void respondePergunta4() {
    System.out.println("Algum tweeter teve registro em mais de um idioma? Qual, quais e/ou quantos?");
    ListaSe tweeters = new ListaSe();
    ListaSe tweetersBilingue = new ListaSe();

    // econtra os tweeters unicos tanto em id quanto em lingua
    for (int i = 0; i < listaDeLinguagens.tamanho(); i++) {
      ListaSe linguagemSelecionada = listaDeLinguagens.getCelula(i).getCelulaLista();
      for (int j = 0; j < linguagemSelecionada.tamanho(); j++) {
        Tweet tweet = linguagemSelecionada.getCelula(j).getCelulaTweet();

        if (tweeters.tamanho() == 0) {
          tweeters.inserirNoFinal(new CelulaSE(tweet));
        } else {
          boolean tweeterJaRegistrado = false;
          for (int k = 0; k < tweeters.tamanho(); k++) {
            Tweet tweeter = tweeters.getCelula(k).getCelulaTweet();

            if (tweeter.getAnnotatorID().equals(tweet.getAnnotatorID())
                && tweeter.getLingua().equals(tweet.getLingua())) {
              tweeterJaRegistrado = true;

              break;
            }
            // caso tenha o mesmo id porem a lingua seja diferente adiciona o registro
            if (tweeter.getAnnotatorID().equals(tweet.getAnnotatorID())
                && !tweeter.getLingua().equals(tweet.getLingua())) {
              if (tweetersBilingue.tamanho() == 0) {
                tweetersBilingue.inserirNoFinal(new CelulaSE(tweet));
              } else {
                tweetersBilingue.inserirNoInicio(new CelulaSE(tweet));
              }
            }
          }

          if (!tweeterJaRegistrado) {
            tweeters.inserirNoInicio(new CelulaSE(tweet));
          }
        }

      }
      System.out.println("processado");
    }

    System.out.println("Tweeters unicos para validacao: ");
    for (int i = 0; i < tweeters.tamanho(); i++) {
      System.out.println("Tweeter: " + tweeters.getCelula(i).getCelulaTweet().getAnnotatorID() + "lang: "
          + tweeters.getCelula(i).getCelulaTweet().getLingua());
    }

    System.out.println("Tweeters Bilingue: ");
    for (int i = 0; i < tweetersBilingue.tamanho(); i++) {
      System.out.println("Tweeter: " + tweeters.getCelula(i).getCelulaTweet().getAnnotatorID() + "lang :"
          + tweeters.getCelula(i).getCelulaTweet().getLingua());
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
