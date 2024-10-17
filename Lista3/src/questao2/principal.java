package questao2;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class principal {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        Random aleatorio = new Random();
        for (int i = 0; i < 10; i++) {
            double numero = aleatorio.nextDouble(1,100);
            lista.add(numero);
        }
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: "+lista);

        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Lista ordenada em reverso: "+lista);
    }
}
