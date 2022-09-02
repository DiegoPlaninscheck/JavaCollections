package HashSet;

import java.util.HashSet;

public class ex04 {
    public static void main(String[] args) {
        HashSet<String> listaPaises = new HashSet<>();

        listaPaises.add("Brasil");
        listaPaises.add("Estados Unidos");
        listaPaises.add("França");
        listaPaises.add("Italia");
        listaPaises.add("Alemanha");
        listaPaises.add("Inglaterra");

        listaPaises.clear();

        System.out.println(listaPaises);

    }
}
