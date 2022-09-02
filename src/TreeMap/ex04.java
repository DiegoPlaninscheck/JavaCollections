package TreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> listaPowerRangers = new TreeMap<>();

        listaPowerRangers.put(1, "Preto");
        listaPowerRangers.put(2, "Branco");
        listaPowerRangers.put(3, "Rosa");
        listaPowerRangers.put(4, "Amarelo");
        listaPowerRangers.put(5, "Verde");

        System.out.println("Insira um valor: ");
        String valor = sc.next();

        System.out.println(listaPowerRangers.containsValue(valor));
    }
}
