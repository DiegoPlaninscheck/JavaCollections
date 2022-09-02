package HashSet;

import java.util.HashSet;

public class ex03 {
    public static void main(String[] args) {
        HashSet<String> listaEstados = new HashSet<>();
        listaEstados.add("Minas Gerais");
        listaEstados.add("São Paulo");
        listaEstados.add("Rio de Janeiro");
        listaEstados.add("Santa Catarina");
        listaEstados.add("Rio Grande do Sul");

        System.out.println(listaEstados.size());

    }
}
