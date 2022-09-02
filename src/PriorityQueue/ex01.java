package PriorityQueue;

import java.util.PriorityQueue;

public class ex01 {
    public static void main(String[] args) {
        PriorityQueue<String> listaSintomas = new PriorityQueue<>();

        listaSintomas.add("Gripe");
        listaSintomas.add("Tosse");
        listaSintomas.add("Espiro");
        listaSintomas.add("Corise");
        listaSintomas.add("Dor de garganta");

        System.out.println(listaSintomas);

    }
}
