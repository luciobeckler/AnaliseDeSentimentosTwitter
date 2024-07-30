import ImplementacaoLista.ListaSe;

public class Main {
        public static void main(String[] args) {
                LeitorDeArquivos leitorDeArquivos = new LeitorDeArquivos();

                // Leitura de arquivos e criação de objetos
                ListaSe listaDeLinguagens = new ListaSe(); // Lista que irá armazenar as listas de tweets de cada língua

                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Albanian_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Bosnian_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Bulgarian_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Croatian_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/English_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/German_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Hungarian_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Polish_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Portuguese_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Russian_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Serbian_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Slovak_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Slovenian_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Spanish_Twitter_sentiment.csv"));
                listaDeLinguagens
                                .inserirNoInicio(leitorDeArquivos
                                                .LeArquivosECriaObjetos("src/Data/Swedish_Twitter_sentiment.csv"));

                RespondePerguntasTp respondePerguntasTp = new RespondePerguntasTp(listaDeLinguagens);

                respondePerguntasTp.respondePergunta1();
                // respondePerguntasTp.respondePergunta2(); Código gerando demora para rodar
                // respondePerguntasTp.respondePergunta3();
                respondePerguntasTp.respondePergunta4();
        }
}