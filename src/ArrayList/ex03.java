package ArrayList;

import java.util.ArrayList;

public class ex03 {
    public static void main(String[] args) {
        ArrayList<String>  listaAnimais = new ArrayList<>();

        listaAnimais.add("Porco");
        listaAnimais.add("Vaca");
        listaAnimais.add("Cachorro");
        listaAnimais.add("Gato");

        listaAnimais.add(0, "Pica-pau");
        listaAnimais.add(5, "Quero-quero");

        for(int i = 0; i < listaAnimais.size(); i++){
            System.out.println(listaAnimais.get(i));
        }
    }
}
