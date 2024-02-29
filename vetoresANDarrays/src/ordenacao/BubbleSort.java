package ordenacao;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10);
            System.out.println("Meu array = " + array[i]);
        }

        int menor = 0;
        int temp;
        // BUBBLE SORT O(N^²)
        for (int i = 0; i < array.length; i++ ){ // O(N)
            for (int j = i + 1; j < array.length; j++){// O(N-1)
                if (array[i] > array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }
        System.out.println("Array ordenado");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
