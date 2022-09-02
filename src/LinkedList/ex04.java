package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ex04 {
    public static void main(String[] args) {
        LinkedList<String> listaCursos = new LinkedList<>();
        listaCursos.add("TI");
        listaCursos.add("Eletronica");
        listaCursos.add("Eletrotecnica");
        listaCursos.add("Mecanica");
        listaCursos.add("Eletrica");

        int i = listaCursos.size();

        do {
            System.out.println(listaCursos.get(i - 1));
            i--;
        } while (i <= listaCursos.size() && i != 0);
    }
}
