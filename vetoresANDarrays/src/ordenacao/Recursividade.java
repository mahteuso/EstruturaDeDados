package ordenacao;

public class Recursividade {
    public static void main(String[] args) {
        int[] list = new int[10];

        System.out.println("---------------------------------");
        System.out.println("Lista:");
        System.out.println("---------------------------------");
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * list.length);
            System.out.println(list[i]);
        }

        int somaLista = somaRecursiva(0, 0, list);
        System.out.println("---------------------------------");
        System.out.println("Valor da Soma dos valores da lista: " + somaLista);
        System.out.println("---------------------------------");

        int tamanhoDaLista = tamanhoLista( 0, list);
        System.out.println("---------------------------------");
        System.out.println("Valor do tamanho da lista: "+tamanhoDaLista);
        System.out.println("---------------------------------");
        
    }


    private static int somaRecursiva(int soma, int indice, int[] lista) {
        if (indice < lista.length) {
            soma += lista[indice];
            indice += 1;
            return somaRecursiva(soma, indice, lista);
        }
        return soma;
    }

    private static int tamanhoLista(int indice, int[] lista) {
        if (indice < lista.length) {
            indice += 1;
            return tamanhoLista(indice, lista);
        }
        return indice;
    }

}
