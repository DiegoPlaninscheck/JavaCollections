package PriorityQueue;

import java.util.PriorityQueue;

public class ex05 {
    public static void main(String[] args) {
        PriorityQueue<String> listaPerifericos = new PriorityQueue<>();

        listaPerifericos.add("Monitor");
        listaPerifericos.add("Teclado");
        listaPerifericos.add("HeadSet");
        listaPerifericos.add("Mouse");

        listaPerifericos.clear();

        System.out.println(listaPerifericos);

    }
}
