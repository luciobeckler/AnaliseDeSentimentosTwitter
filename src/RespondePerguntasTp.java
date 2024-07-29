import ImplementacaoLista.ListaSe;

public class RespondePerguntasTp {

  ListaSe listaDeLinguagens;

  public RespondePerguntasTp(ListaSe listaDeLinguagensParametro) {
    listaDeLinguagens = listaDeLinguagensParametro;
  }

  public void respondePergunta1() {
    System.out.println("Qual o volume de tweets para cada idioma?");

    for (long i = 0; i <= listaDeLinguagens.tamanho(); i++) {
      System.out.println("O idioma: "
          + listaDeLinguagens.getCelula(0).getCelulaLista().getCelula(0).getCelulaTweet().getLingua() + " tem "
          + listaDeLinguagens.getCelula(0).getCelulaLista().tamanho() + " tweets");
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
}
