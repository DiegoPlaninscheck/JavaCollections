package HashSet;

import java.util.HashSet;

public class ex05 {
    public static void main(String[] args) {
        HashSet<String> listaContinentes = new HashSet<>();

        listaContinentes.add("Europa");
        listaContinentes.add("Africa");
        listaContinentes.add("America");
        listaContinentes.add("Oceania");
        listaContinentes.add("Asia");

        if (listaContinentes.size() == 0) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("O tamanho da lista é: " + listaContinentes.size());
        }

    }
}
