package generclinkedlist.test;

import java.util.ArrayList;

public class TimeMeterArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> testNumber = new ArrayList<>();
        int numberSize = 1000000;

        double inicalTime;
        double finalTime;

        inicalTime = System.currentTimeMillis();
        for (int i = 0; i < numberSize; i++) {
            testNumber.add(i);
        }
        finalTime = System.currentTimeMillis();

        double totalTime = finalTime - inicalTime;

        System.out.println("Time for add all elements to linkedlist: " + totalTime + "ms");
        System.out.println("-------------------------------------------------------------");

        inicalTime = System.currentTimeMillis();
        for (int i = 0; i < numberSize; i++) {
            testNumber.get(i);
        }
        finalTime = System.currentTimeMillis();
        totalTime = finalTime - inicalTime;
        System.out.println("Time for find all elements to linkedlist using getElements() method: " + totalTime + "ms");
        System.out.println("-------------------------------------------------------------");
    }
}
