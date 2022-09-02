package TreeMap;

import java.util.TreeMap;

public class ex02 {
    public static void main(String[] args) {
        TreeMap<Integer, String> listaGeneros1 = new TreeMap<>();
        TreeMap<Integer, String> listaGeneros2 = new TreeMap<>();

        listaGeneros1.put(1, "Masculino");
        listaGeneros1.put(2, "Agenero");
        listaGeneros1.put(3, "Pangenero");

        listaGeneros2.put(4, "Feminino");
        listaGeneros2.put(5, "two-spirit");
        listaGeneros2.put(6, "genero neutro");

        listaGeneros1.putAll(listaGeneros2);

        System.out.println(listaGeneros1);
    }
}
