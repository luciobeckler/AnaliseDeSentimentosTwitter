package ImplementacaoListaSE;

public class ListaSe {

    CelulaSE primeiro;

    public ListaSe() {
        primeiro = null;
    }

    public boolean vazio() {
        return (primeiro == null);
    }

    public void inserirNoInicio(CelulaSE celula) {
        if (vazio())
            primeiro = celula;
        else {
            celula.prox = primeiro;
            primeiro = celula;
        }
    }

    public void inserirNoFinal(CelulaSE celula) {
        if (vazio())
            primeiro = celula;
        else {
            CelulaSE aux = primeiro;
            while (aux.prox != null) {
                aux.prox = celula;
            }
        }
    }

    public void inserirNoInicio(ListaSe lista) {
        if (vazio())
            primeiro = new CelulaSE(lista);
        else {
            CelulaSE aux = primeiro;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = new CelulaSE(lista);
        }
    }

    public void imprimir() {
        CelulaSE aux = primeiro;
        while (aux != null) {
            System.out.println(aux.tweetItem);
            aux = aux.prox;
        }
    }

    public long tamanho() {
        CelulaSE aux = primeiro;
        long cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.prox;
        }
        return cont;
    }

    public CelulaSE getCelula(int posicao) {
        CelulaSE aux = primeiro;
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

    public CelulaSE getPrimeiro() {
        return primeiro;
    }
}
