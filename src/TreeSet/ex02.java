package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ex02 {
    public static void main(String[] args) {
        TreeSet<String> listaInsetos = new TreeSet<>();

        listaInsetos.add("Barata");
        listaInsetos.add("Formiga");
        listaInsetos.add("Abelha");
        listaInsetos.add("Mosca");

        Iterator<String> iterator = listaInsetos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
