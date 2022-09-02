package HashMap;

import java.util.HashMap;

public class ex03 {
    public static void main(String[] args) {
        HashMap<Integer, String> listaFramework1 = new HashMap<>();
        HashMap<Integer, String> listaFramework2 = new HashMap<>();

        listaFramework1.put(1, "Angular");
        listaFramework1.put(2, "React");
        listaFramework1.put(3, "Vue");

        listaFramework2.put(4, "Bootstrap");
        listaFramework2.put(5, "Express");
        listaFramework2.put(6, "Spring");

        listaFramework1.putAll(listaFramework2);

        System.out.println(listaFramework1);
    }
}
