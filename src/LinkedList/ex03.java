package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> listaMarcas = new LinkedList<>();

        listaMarcas.add("Nike");
        listaMarcas.add("Adidas");
        listaMarcas.add("Puma");
        listaMarcas.add("Guaraná");
        listaMarcas.add("Coca-cola");

        System.out.println("Qual posicao?");
        int posicao = sc.nextInt();

        for (int i = posicao; i < listaMarcas.size(); i++) {
            System.out.println(listaMarcas.get(i));
        }
    }
}
