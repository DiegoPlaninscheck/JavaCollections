package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ex04 {
    public static void main(String[] args) {
        TreeSet<String> listaMamiferos = new TreeSet<>();

        listaMamiferos.add("Baleia");
        listaMamiferos.add("Morcego");
        listaMamiferos.add("Tigre");
        listaMamiferos.add("Elefante");
        listaMamiferos.add("Veado");

        System.out.println("Lista Inicial: " + listaMamiferos);

        Iterator<String> iterator = listaMamiferos.descendingIterator();

        System.out.print("Lista ao contrário: " );
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }

    }
}
