package HashMap;

import java.util.HashMap;

public class ex02 {
    public static void main(String[] args) {
        HashMap<Integer, String> listaBebidas = new HashMap<>();

        listaBebidas.put(1, "Café");
        listaBebidas.put(2, "Leite");
        listaBebidas.put(3, "Água");
        listaBebidas.put(4, "Refri");
        listaBebidas.put(5, "Chocolate quente");

        System.out.println(listaBebidas.size());

    }
}
