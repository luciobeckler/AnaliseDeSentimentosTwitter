package ImplementacaoLista;

public class ResultadoAnalise {

    AnaliseLingua primeiro;

    public ResultadoAnalise() {
        primeiro = null;
    }

    public ResultadoAnalise(ResultadoAnalise analise) {
        if (analise != null && analise.primeiro != null) {
            this.primeiro = new AnaliseLingua(analise.primeiro);
            AnaliseLingua atual = this.primeiro;
            AnaliseLingua aux = analise.primeiro.prox;

            while (aux != null) {
                AnaliseLingua novo = new AnaliseLingua(aux); 
                atual.prox = novo; 
                atual = novo; 
                aux = aux.prox;
            }
        }
    }

    public boolean vazio() {
        return (primeiro == null);
    }

    public void inserirNoFinal(AnaliseLingua result) {
        if (vazio())
            primeiro = result;
        else {
            AnaliseLingua aux = primeiro;
            while (aux.prox != null) {
                aux.prox = primeiro;
            }
        }
    }

    public void inserirNoInicio(AnaliseLingua analise) {
        if (vazio())
            primeiro = analise;
        else {
            AnaliseLingua aux = primeiro;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = analise;
        }
    }

    public long tamanho() {
        if (primeiro == null)
            return 0;

        AnaliseLingua aux = primeiro;
        long cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.prox;
        }
        return cont;
    }

    public void imprimir() {
        AnaliseLingua aux = primeiro;
        while (aux != null) {
            System.out.println(aux.lingua);
            aux = aux.prox;
        }
    }

    public AnaliseLingua get(int posicao) {
        AnaliseLingua aux = primeiro;
        int cont = 0;
        while (aux != null) {
            if (cont == posicao) {
                return aux;
            }
            aux = aux.prox;
            cont++;
        }
        return null;
    }

    public void removerNoMeio(int posicao) {
        if (vazio()) {
            System.out.println("Lista já estava vazia");
            return;
        }

        if (posicao == 0) {
            primeiro = primeiro.prox;
            return;
        }

        AnaliseLingua aux = primeiro;
        AnaliseLingua anterior = null;
        int cont = 0;

        while (aux != null) {
            if (cont == posicao) {
                if (anterior != null) {
                    anterior.prox = aux.prox;
                }
                return;
            }
            anterior = aux;
            aux = aux.prox;
            cont++;
        }
    }
}
