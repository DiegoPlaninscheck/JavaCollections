package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ex05 {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Diego");
        listaNomes.add("Thiago");
        listaNomes.add("João");
        listaNomes.add("Camilly");

        listaNomes.set(2, "Bruna");

        System.out.println(listaNomes);
    }
}
