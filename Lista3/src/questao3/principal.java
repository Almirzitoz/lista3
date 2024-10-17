package questao3;
import java.util.Random;
import java.util.ArrayList;
public class principal {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random aleatorio = new Random();

        for (int i = 0; i < 10; i++) {
            int numero = aleatorio.nextInt(1,100);
            lista.add(numero);
        }
        System.out.println("Lista antes: "+lista);
        for (int i = lista.size() - 1; i >= 0; i--) {
            if (lista.get(i)%2 == 0) {
                lista.remove(i);
            }
        }
        System.out.println(lista);
    }
}
