import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vetorA[] = new int[10];
        int soma = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <=10; i++) {
            System.out.println("Digite um valor");
            vetorA[i-1] = s.nextInt();
        }
        for (int i=1;i<=10;i++) {
            System.out.println("Número: " +vetorA[i-1]);
            soma = soma + vetorA[i-1];
            if (i%2==0){
                System.out.println("A soma dos dois valores é: " +soma);
                soma = 0;
            }
        }
    }
}