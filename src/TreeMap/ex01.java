package TreeMap;

import java.util.TreeMap;

public class ex01 {
    public static void main(String[] args) {
        TreeMap<Integer, String> listaConfractus = new TreeMap<>();

        listaConfractus.put(1, "Kolbe");
        listaConfractus.put(2, "Udyr");
        listaConfractus.put(3, "Dante");
        listaConfractus.put(4, "Odilha");
        listaConfractus.put(5,  "Mabi");

        System.out.println(listaConfractus);

    }
}
