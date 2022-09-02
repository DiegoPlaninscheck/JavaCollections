package HashMap;

import java.util.HashMap;

public class ex01 {
    public static void main(String[] args) {
        HashMap<Integer,String> listaLinguagensProgramação = new HashMap();

        listaLinguagensProgramação.put(1,"Java");
        listaLinguagensProgramação.put(2,"C+");
        listaLinguagensProgramação.put(3,"Javascript");
        listaLinguagensProgramação.put(4,"Phyton");
        listaLinguagensProgramação.put(5,"Ruby");

        System.out.println(listaLinguagensProgramação);
    }
}
