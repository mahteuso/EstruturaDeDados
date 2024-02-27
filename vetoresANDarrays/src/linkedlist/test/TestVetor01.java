package linkedlist.test;

import linkedlist.domain.Vetor;

public class TestVetor01 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        System.out.println(vetor);

        vetor.adiciona("Mateus");
        vetor.adiciona("Mateus");
        vetor.adiciona("Mateus");
        vetor.adiciona("Joirge");
        vetor.adiciona("Mateus");
        vetor.adiciona("Rafael");
        vetor.adiciona("Mateus");
        vetor.adiciona("Mateus");
        vetor.adiciona("Mateus");
        System.out.println(vetor);
    }
}
