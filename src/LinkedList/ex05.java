package LinkedList;

import java.util.LinkedList;

public class ex05 {
    public static void main(String[] args) {
        LinkedList<String> listaNavegadores = new LinkedList<>();

        listaNavegadores.add("Firefox");
        listaNavegadores.add("Chrome");
        listaNavegadores.add("Edge");
        listaNavegadores.add("Explorer");

        listaNavegadores.add(0, "Opera");

        System.out.println(listaNavegadores);
    }
}
