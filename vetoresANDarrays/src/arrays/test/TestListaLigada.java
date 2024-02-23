package arrays.test;

import arrays.domain.LinkedList;

public class TestListaLigada {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        lista.setNewElement("Mateus");
        lista.setNewElement("Marco");
        lista.setNewElement("Rogério");
        lista.setNewElement("Seilá");


        System.out.println(lista.getFirst().getValue());
        System.out.println(lista.getFirst().getNext().getValue());
        System.out.println(lista.getFirst().getNext().getNext().getValue());
        System.out.println(lista.getFirst().getNext().getNext().getNext().getValue());




        System.out.println("--------------------");


        lista.deleteElement("Mateus");
        System.out.println(lista.getFirst().getValue());
        System.out.println(lista.getFirst().getNext().getValue());
        System.out.println(lista.getFirst().getNext().getNext().getValue());

        System.out.println("------------------");
        System.out.println(lista.getSize());
        System.out.println(lista.getElement(4).getValue());
        lista.setNewElement("Novo");
        System.out.println(lista.getFirst().getNext().getNext().getNext().getValue());

        System.out.println("--------------------");
        System.out.println(lista.getElement(4).getValue());


    }
}
