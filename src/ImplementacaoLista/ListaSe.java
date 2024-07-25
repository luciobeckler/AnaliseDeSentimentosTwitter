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
        celula.prox = primeiro;
        primeiro = celula;
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
            System.out.println("Valor:" + aux.valor);
            aux = aux.prox;
        }
    }

    public static ListaSe juntarListas(ListaSe lista1, ListaSe lista2) {

        ListaSe listaNova = new ListaSe();
        Celula aux = lista1.primeiro;
        Celula aux2 = lista2.primeiro;

        while (aux != null) {
            listaNova.inserirNoFinal(aux);
            aux = aux.prox;
        }

        while (aux2 != null) {
            listaNova.inserirNoFinal(aux2);
            aux2 = aux2.prox;
        }

        return listaNova;
    }
}
