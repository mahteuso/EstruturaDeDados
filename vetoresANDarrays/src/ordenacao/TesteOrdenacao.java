package ordenacao;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteOrdenacao<TYPE> {
    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 9, 10, 30, 2, 1};
        int[] listOrdenada = ordenacaoSelection(arr);
        buscaBinaria(10, listOrdenada);
    }

    private static int[] ordenacaoSelection(int[] list) {
        int temp, menor;

        System.out.println("----------------------");
        System.out.println("Lista Desordenada");
        System.out.println("----------------------");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        for (int i = 0; i < list.length; i++) {
            menor = i;
            temp = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (list[menor] > list[j]) {
                    menor = j;
                }
            }
            list[i] = list[menor];
            list[menor] = temp;

        }
        System.out.println("--------------------------------");
        System.out.println("Lista ordenada!!!");
        System.out.println("--------------------------------");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        return list;
    }

    private static void buscaBinaria(int value, int[] list) {
        int meio;
        int inicioList = 0;
        int finalList = list.length - 1;
        boolean number = false;
        while (finalList >= inicioList) {
            meio = (inicioList + finalList);
            if (list[meio] == value) {
                System.out.println("Número encontrado = " + list[meio] + " na posição = [" + meio + "]");
                number = true;
                break;
            } else if (list[meio] < value) {
                inicioList = meio + 1;
            } else {
                finalList = meio - 1;
            }

        }
        if (!number) {
            System.out.println("O número: " + value + " não foi encontrado!");
        }
    }
}
