package TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class ex05 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> listaNumeros = new TreeMap<>();

        listaNumeros.put(1, 5);
        listaNumeros.put(2, 4);
        listaNumeros.put(3, 3);
        listaNumeros.put(4, 2);
        listaNumeros.put(5, 1);

        Set<Integer> keys = listaNumeros.keySet();

        for (Integer key : keys) {
            System.out.println(key);
        }
    }
}
