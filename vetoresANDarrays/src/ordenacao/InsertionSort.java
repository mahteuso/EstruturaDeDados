package ordenacao;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println("Meu array = " + array[i]);
        }

       int temp, j;

        for (int i = 0; i < array.length; i++){
            j = i - 1;
            temp = array[i];
            while(j >= 0 && temp < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }


        System.out.println("Vetor ordenado");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
