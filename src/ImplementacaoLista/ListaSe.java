package ImplementacaoLista;

public class ListaSe {

    Celula primeiro;

    public ListaSe() {
        primeiro = null;
    }

    public boolean vazio() {
        return (primeiro == null);
    }

    public void inserirNoInicio(Celula celula) {
        if (vazio())
            primeiro = celula;
        else {
            celula.prox = primeiro;
            primeiro = celula;
        }
    }

    public void inserirNoInicio(ListaSe lista) {
        if (vazio())
            primeiro = new Celula(lista);
        else {
            Celula aux = primeiro;
            while (aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = new Celula(lista);
        }
    }

    public void inserirNoMeio(int posicao, Celula celula) {
        Celula aux = primeiro;
        Celula aux2 = primeiro.prox;
        int cont = 0;

        if (vazio() || posicao == 0) {
            inserirNoInicio(celula);
            return;
        }
        while (aux2 != null) {
            if (cont == posicao - 1) {
                aux.prox = celula;
                celula.prox = aux2;
                return;
            }
            aux = aux.prox;
            aux2 = aux2.prox;
            cont++;
        }
    }

    public void removerNoFinal() {
        Celula aux = primeiro;
        Celula aux2 = primeiro.prox;

        if (vazio()) {
            System.out.println("Lista já estava vazia");
            return;
        } else if (primeiro.prox == null) {
            primeiro = null;
            return;
        }
        while (aux2.prox != null) {
            aux = aux.prox;
            aux2 = aux2.prox;
        }
        aux.prox = null;
    }

    public void removerNoMeio(int posicao) {
        Celula aux = primeiro;
        Celula aux2 = primeiro.prox;
        int cont = 0;

        if (vazio()) {
            System.out.println("Lista já estava vazia");
            return;
        } else if (posicao == 0) {
            primeiro = aux2;
            return;
        }
        while (aux2 != null) {
            if (cont == posicao - 1) {
                aux.prox = aux2.prox;
                return;
            }
            aux = aux.prox;
            aux2 = aux2.prox;
            cont++;
        }
    }

    public void removerNoInicio() {
        if (vazio()) {
            System.out.println("Lista já estava vazia");
            return;
        }
        primeiro = primeiro.prox;
    }

    public void inserirNoFinal(Celula celula) {
        if (vazio())
            primeiro = celula;
        else {
            Celula aux = primeiro;
            while (aux.prox != null) {
                aux.prox = celula;
            }
        }
    }

    public void imprimir() {
        Celula aux = primeiro;
        while (aux != null) {
            System.out.println(aux.tweetItem);
            aux = aux.prox;
        }
    }

    public long tamanho() {
        Celula aux = primeiro;
        long cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.prox;
        }
        return cont;
    }

    public Celula getCelula(int posicao) {
        Celula aux = primeiro;
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

    public Celula getPrimeiro() {
        return primeiro;
    }
}
