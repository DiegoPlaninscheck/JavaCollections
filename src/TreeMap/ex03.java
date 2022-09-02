package TreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> listaFeriados = new TreeMap<>();

        listaFeriados.put(1, "Natal");
        listaFeriados.put(2, "Ano novo");
        listaFeriados.put(3, "Dia da independencia");
        listaFeriados.put(4, "Pascoa");
        listaFeriados.put(5, "Dia do trabalhador");

        System.out.println("Insira uma chave: ");
        int chave = sc.nextInt();

        System.out.println(listaFeriados.get(chave));
    }
}
