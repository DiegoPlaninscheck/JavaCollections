package HashSet;

import java.util.HashSet;

public class ex01 {
    public static void main(String[] args) {
        HashSet<String> listaMes = new HashSet<>();

        listaMes.add("Março");
        listaMes.add("Julho");
        listaMes.add("Novembro");
        listaMes.add("Fevereiro");
        listaMes.add("Dezembro");

        System.out.println(listaMes);
    }
}
