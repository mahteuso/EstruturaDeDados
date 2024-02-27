package generclinkedlist.test;

import generclinkedlist.domain.IteratorLinkedList;
import generclinkedlist.domain.LinkedList;

public class TimeMeterGenericLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> meter = new LinkedList<>();


        int numberSize = 1000000;

        double inicalTime;
        double finalTime;

        inicalTime = System.currentTimeMillis();
        for (int i = 0; i < numberSize; i++) {
            meter.setNewElement(i);
        }
        finalTime = System.currentTimeMillis();

        double totalTime = finalTime - inicalTime;

        System.out.println("Time for add all elements to linkedlist: " + totalTime + "ms");
        System.out.println("-------------------------------------------------------------");

        IteratorLinkedList<Integer> iterator = meter.getIterator();
        inicalTime = System.currentTimeMillis();

        while (iterator.nextExist()){
            iterator.getNextIterator();
        }

        finalTime = System.currentTimeMillis();
        totalTime = finalTime - inicalTime;
        System.out.println("Time for find all elements to linkedlist using IteratorClass: " + totalTime + "ms");
    }
}

