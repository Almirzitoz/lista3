package questao1;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        Random aleatorio = new Random();

        for (int i = 0; i < 10; i++) {
            int numero = aleatorio.nextInt(1,100);
            lista.add(numero);
        }
        System.out.println(lista);

        lista.remove(2);
        int novoNumero = aleatorio.nextInt(1,100);
        lista.add(novoNumero);
        System.out.println("Insira um numero da lista:");
        int escolha = scanner.nextInt();
        if (lista.contains(escolha)) {
            System.err.println("Numero na lista!");
        }else{
            System.out.println("Numero não está na lista!");
        }
        System.err.println(lista);
        scanner.close();
    }
}
