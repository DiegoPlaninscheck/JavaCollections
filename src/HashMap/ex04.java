package HashMap;

import java.util.HashMap;

public class ex04 {
    public static void main(String[] args) {
        HashMap<Integer, String> listaLinux = new HashMap<>();

        listaLinux.put(1, "Fedora");
        listaLinux.put(2, "Mint");
        listaLinux.put(3, "CentOS");

        listaLinux.clear();

        System.out.println(listaLinux);

    }
}
