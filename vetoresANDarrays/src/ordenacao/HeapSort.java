package ordenacao;

public class HeapSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        System.out.println("Vetor desordenado!");
        System.out.println("---------------------------------------");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i] + " ,");
        }
        System.out.println("\n---------------------------------------");

        int n = vetor.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            ordenaHeapSort(vetor, n, i);
        }

        for (int j = n - 1; j > 0; j--) {
            int temp = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = temp;
            ordenaHeapSort(vetor, j, 0);
        }

        System.out.println("Vetor Ordenado!");
        System.out.println("---------------------------------------");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ,");
        }
        System.out.println("\n---------------------------------------");

    }

    private static void ordenaHeapSort(int[] vetor, int n, int i) {
        int raiz = i;
        int esq = 2 * i + 1;
        int dir = 2 * i + 2;

        if (esq < n && vetor[esq] > vetor[raiz]) {
            raiz = esq;
        }
        if (dir < n && vetor[dir] > vetor[raiz]) {
            raiz = dir;
        }
        if (raiz != i) {
            int temp = vetor[raiz];
            vetor[raiz] = vetor[i];
            vetor[i] = temp;

            ordenaHeapSort(vetor, n, raiz);
        }
    }

}
