package ordenacao;

public class HeapSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        System.out.println("Vetor desordenado!");
        System.out.println("---------------------------------------");
        //criação do vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i]+" ,");
        }
        System.out.println("\n---------------------------------------");

        // 1ª parte - Ordenando os troncos e raiz da arvore binária

        int n = vetor.length;
        for(int i = n / 2 - 1; i >= 0; i--){
            ordenaHeapSort(vetor, n, i);
        }

        // 2ª parte - Ordenando o restante e verificando novamente os troncos

        for (int i = n - 1; i > 0; i--){
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;
            ordenaHeapSort(vetor, i, 0);

        }

        System.out.println("Vetor Ordenado!");
        System.out.println("---------------------------------------");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ,");
        }
        System.out.println("\n---------------------------------------");

        //

    }

    // Método que vai realizar a mudança de todos os nós e raiz principal da árvore binária
    private static void ordenaHeapSort(int[] vetor, int n, int i) {
        int raiz = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;
        if (esq < n && vetor[esq] > vetor[raiz]){
            raiz = esq;
        }
        if (dir < n && vetor[dir] > vetor[raiz]){
            raiz = dir;
        }
        if (raiz != i){
            int temp = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = temp;
            ordenaHeapSort(vetor, n, raiz);
        }
    }
}


