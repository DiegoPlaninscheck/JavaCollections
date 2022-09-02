package PriorityQueue;

import java.util.PriorityQueue;

public class ex04 {
    public static void main(String[] args) {
        PriorityQueue<Integer> listaNumerosImpares = new PriorityQueue<>();

        listaNumerosImpares.add(1);
        listaNumerosImpares.add(3);
        listaNumerosImpares.add(5);
        listaNumerosImpares.add(7);
        listaNumerosImpares.add(9);

        listaNumerosImpares.offer(11);

        System.out.println(listaNumerosImpares);

    }
}
