package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ex02 {
    public static void main(String[] args) {
        LinkedList<String> listaInvertebrados = new LinkedList<>();

        listaInvertebrados.add("Cobra");
        listaInvertebrados.add("Gafanhoto");
        listaInvertebrados.add("Aranha");
        listaInvertebrados.add("Barata");

        Iterator<String> iterator = listaInvertebrados.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
