package ordenacao;

public class InversaoLista {
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("---------------------------------");
        System.out.println("Lista:");
        System.out.println("---------------------------------");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }


       /* for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * list.length);
            System.out.println(list[i]);
        }*/
        int temp, meio;
        int inicio = 0;
        int fim = list.length - 1;
        int resto = list.length % 2;
        if (resto != 0) {
            meio = (inicio + fim) / 2;
            while (fim > meio && inicio < meio) {
                temp = list[inicio];
                list[inicio] = list[fim];
                list[fim] = temp;
                inicio++;
                fim--;
            }
        } else {

            while (inicio < fim) {
                temp = list[inicio];
                list[inicio] = list[fim];
                list[fim] = temp;
                inicio++;
                fim--;
            }


        }
        System.out.println("---------------------------------");
        System.out.println("Lista Invertida:");
        System.out.println("---------------------------------");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

