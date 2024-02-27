package generclinkedlist.test;

import generclinkedlist.domain.LinkedList;

public class GenericListTest01 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();

        lista.setNewElement(10);
        lista.setNewElement(20);
        lista.setNewElement(30);
        lista.setNewElement(40);


        System.out.println("-------------------");
        lista.getElement(20);
        System.out.println("-------------------");
        System.out.println("List size: " + lista.getSize());

        lista.deleteElement(30);

        System.out.println("List size: " + lista.getSize());
        System.out.println("-------------------");
        lista.setNewElement(100);

        System.out.println("List size: " + lista.getSize());
        System.out.println("-------------");

        System.out.println("-------------");
        lista.modifyElement(10, 1000);

        System.out.println("List size: " + lista.getSize());
    }
}
