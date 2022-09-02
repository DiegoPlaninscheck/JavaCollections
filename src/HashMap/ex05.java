package HashMap;

import java.util.HashMap;

public class ex05 {
    public static void main(String[] args) {
        HashMap<Integer, String> listaProfessores = new HashMap<>();

        listaProfessores.put(1, "Romario");
        listaProfessores.put(2, "Leandro");
        listaProfessores.put(3, "Jhonny");
        listaProfessores.put(4, "Tathi");
        listaProfessores.put(5, "Bruno");

        if(listaProfessores.size() == 0){
            System.out.println(listaProfessores.size());
        } else {
            System.out.println("O tamanho da lista é: " + listaProfessores.size());
        }

    }
}
