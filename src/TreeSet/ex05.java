package TreeSet;

import java.util.TreeSet;

public class ex05 {
    public static void main(String[] args) {
        TreeSet<String> listaAnos = new TreeSet<>();

        listaAnos.add("2005");
        listaAnos.add("2004");
        listaAnos.add("2006");
        listaAnos.add("2003");
        listaAnos.add("2020");
        listaAnos.add("2022");

        System.out.println(listaAnos);

        System.out.println("Primeiro: " + listaAnos.first());
        System.out.println("Ultimo: " + listaAnos.last());

    }
}
