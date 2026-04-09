import java.util.ArrayList;

public class Frutas{

    public static void main(String[] args){
        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> frutas = new ArrayList<>();
        arr1.add("Texto 1");
        arr1.add("Texto 2");
        arr1.add("Texto 3");

        System.out.println(arr1.size());
        System.out.println(arr1.get(2));
        arr1.set(1, "Novo valor da String");
        System.out.println(arr1);

        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Abacaxi");
        frutas.add("Uva");

        System.out.println("Frutas: " + frutas);
        System.out.println("Comprimento: " + frutas.size());
        frutas.remove("Banana");
        System.out.println("Após remover Banana: " + frutas);

        System.out.println("Comprimento: " + frutas.size());
        System.out.println(frutas.get(2));
        frutas.set(3, "Abacate");
        System.out.println("Frutas: " + frutas);
    }

}
