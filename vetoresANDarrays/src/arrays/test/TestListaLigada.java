package arrays.test;

import arrays.domain.LinkedList;

public class TestListaLigada {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        lista.setNewElement("Mateus");
        lista.setNewElement("Marco");
        lista.setNewElement("Rogério");
        lista.setNewElement("Seilá");

        lista.getAllElements();
        System.out.println("-------------------");
        lista.getElement("Rogér");
        System.out.println("-------------------");
        System.out.println(lista.getSize());

        lista.deleteElement("Marco");
        lista.getAllElements();
        System.out.println(lista.getSize());
        lista.setNewElement("NovoNome");
        lista.getAllElements();
        System.out.println(lista.getSize());
        System.out.println("-------------");
        lista.getAllElements();
        System.out.println("-------------");
        lista.modifyElement("Mateus", "Mateus Laranjeira");
        lista.getAllElements();


    }
}
