package TreeSet;

import java.util.TreeSet;

public class ex03 {
    public static void main(String[] args) {
        TreeSet<String> listaAlfabeto1 = new TreeSet<>();
        TreeSet<String> listaAlfabeto2 = new TreeSet<>();

        listaAlfabeto1.add("A");
        listaAlfabeto1.add("B");
        listaAlfabeto1.add("C");

        listaAlfabeto2.add("D");
        listaAlfabeto2.add("E");
        listaAlfabeto2.add("F");

        listaAlfabeto1.addAll(listaAlfabeto2);

        System.out.println(listaAlfabeto1);

    }
}
