import java.util.ArrayList;
import java.util.List;

public class FrutasTarefa {
    public static void main(String[] args){
    List<String> frutas = new ArrayList<>();

    frutas.add("Maça");
    frutas.add("Morango");
    frutas.add("Banana");
    frutas.add(1, "Pessego");

    System.out.println("Lista de frutas: ");
    for (String fruta : frutas){
        System.out.println(fruta);
    }

    frutas.clear();

    System.out.println("Lista de frutas após a limpeza: " + frutas.size());

    }
}
