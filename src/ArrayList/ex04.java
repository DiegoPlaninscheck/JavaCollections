package ArrayList;

import java.util.ArrayList;

public class ex04 {
    public static void main(String[] args) {
        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Banana");
        listaFrutas.add("Maçã");
        listaFrutas.add("Abacate");
        listaFrutas.add("Abacaxi");

        System.out.println(listaFrutas.get(2));
    }
}
