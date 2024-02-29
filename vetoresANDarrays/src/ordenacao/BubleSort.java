package ordenacao;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 20);
            System.out.println("Meu array = " + array[i]);
        }

        int menor = 0;
        int temp;
        int tamanho = array.length - 1;

        for (int i = 0; i < array.length; i++ ){
            for (int j = i + 1; j < array.length; j++){
                if (array[menor] > array[j]){
                    menor = j;
                }
            }
            temp = array[i];
            array[i] = array[menor];
            array[menor] = temp;
        }
        System.out.println("Array ordenado");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
