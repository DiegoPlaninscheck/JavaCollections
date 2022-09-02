package PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ex02 {
    public static void main(String[] args) {
        PriorityQueue<Integer> listaNumerosPrimos = new PriorityQueue<>();

        listaNumerosPrimos.add(2);
        listaNumerosPrimos.add(3);
        listaNumerosPrimos.add(7);
        listaNumerosPrimos.add(11);
        listaNumerosPrimos.add(13);
        listaNumerosPrimos.add(17);
        listaNumerosPrimos.add(23);

        Iterator<Integer> iterator = listaNumerosPrimos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
