package listlinked;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] array = new int[100];

        int number = (int) (Math.random() * 100);
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        System.out.println("O número procurado é: " + number);
        System.out.println("tamanho do array = " +array.length);

        int meio;
        int inicioArray = 0;
        int fimArray = (array.length - 1);
        boolean encontrou = false;


            while (inicioArray <= fimArray) {
                meio = (inicioArray + fimArray) / 2;
                if (array[meio] == number) {
                    System.out.println("Número encontrado, número = " + array[meio]);
                    encontrou = true;
                    break;
                } else if (array[meio] < number) {
                    inicioArray = meio + 1;
                } else {
                    fimArray = meio - 1;
                }
            }
            if (!encontrou) {
                System.out.println("Número não encontrado, valor = " + number);
            }

    }
}
