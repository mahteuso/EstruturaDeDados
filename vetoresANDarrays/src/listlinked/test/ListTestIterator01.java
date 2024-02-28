package listlinked.test;

import generclinkedlist.domain.LinkedList;
import listlinked.domain.IteratorList;
import listlinked.domain.ListLinked;
import listlinked.domain.NodeList;

public class ListTestIterator01 {
    public static void main(String[] args) {
        ListLinked<Integer> numbers = new ListLinked<>();
        int count = 100;

        for (int i = 1; i <= count; i++){
            numbers.setElement(i);
        }

        System.out.println("Size list: " + numbers.getSize());
        System.out.println("----------------------");
        IteratorList<Integer> iterator = numbers.useIterator();

       /* while (iterator.nextExist()){
            System.out.println(iterator.getNext().getValue());
        }*/

        System.out.println("-------------------------------");

        double initialTime = System.currentTimeMillis();
        numbers.getElement(1000000);
        double finalTime = System.currentTimeMillis();
        double totalTime = finalTime - initialTime;

        System.out.println("Time to find element: " + totalTime);
        System.out.println("-------------------------");
        numbers.getall();
        System.out.println("Size list: " + numbers.getSize());
        System.out.println("--------------------------");
        numbers.delElement(50);
        numbers.getall();
        System.out.println("--------------------------");
        System.out.println("Size list: " + numbers.getSize());
    }
}
