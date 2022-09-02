package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ex02 {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(9);
        listaNumeros.add(10);

        Iterator<Integer> iterator = listaNumeros.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
