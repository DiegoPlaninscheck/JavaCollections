package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class ex02 {
    public static void main(String[] args) {
        HashSet<String> listaCidades = new HashSet<>();

        listaCidades.add("Jaraguá do Sul");
        listaCidades.add("Guaramirim");
        listaCidades.add("Blumenau");
        listaCidades.add("Curitiba");
        listaCidades.add("Florianopolis");

        Iterator<String> iterator = listaCidades.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
