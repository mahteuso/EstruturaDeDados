package ordenacao;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println("Meu array = " + arr[i]);
        }

        int temp, menorPosicao;

        // SELECTION SORT BIG O -> O(N²)
        for (int i = 0; i < arr.length; i++) { // O(N)
          menorPosicao = i;
          for (int j = i + 1; j < arr.length; j++){ // O(N)
              if (arr[menorPosicao] > arr[j]){
                  menorPosicao = j;
              }
          }
          temp = arr[menorPosicao];
          arr[menorPosicao] = arr[i];
          arr[i] = temp;
        }
        System.out.println("Vetor ordenado");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
