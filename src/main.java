import java.util.*;

public class main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(123, "Diego", 17);
        Pessoa pessoa2 = new Pessoa(321, "Thiago", 18);
        Pessoa pessoa3 = new Pessoa(456, "João", 19);
        Pessoa pessoa4 = new Pessoa(654, "Camilly", 20);
        Pessoa pessoa5 = new Pessoa(789, "Bruna", 21);
        Pessoa pessoa6 = new Pessoa(987, "Leonardo", 22);
        Pessoa pessoa7 = new Pessoa(987, "Leonardo", 22);

        Set<Pessoa> pessoaSet = new TreeSet<>();
        Collections.addAll(pessoaSet, pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7);

        System.out.println(pessoaSet);

    }
}