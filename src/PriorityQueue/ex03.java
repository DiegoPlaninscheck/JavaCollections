package PriorityQueue;

import java.util.PriorityQueue;

public class ex03 {
    public static void main(String[] args) {
        PriorityQueue<Integer> listaNumerosPares1 = new PriorityQueue<>();
        PriorityQueue<Integer> listaNumerosPares2 = new PriorityQueue<>();

        listaNumerosPares1.add(2);
        listaNumerosPares1.add(4);
        listaNumerosPares1.add(6);

        listaNumerosPares2.add(8);
        listaNumerosPares2.add(10);
        listaNumerosPares2.add(12);

        listaNumerosPares1.addAll(listaNumerosPares2);

        System.out.println(listaNumerosPares1);
    }
}
