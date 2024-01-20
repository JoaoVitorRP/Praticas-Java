import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escolha um número inteiro:");
        double num = reader.nextDouble();

        while (num != (int) num) {
            System.out.println("Número inválido! Escolha um número inteiro:");
            num = reader.nextDouble();
        }

        reader.close();

        String value = "";
        if (num > 0 || num == 0) {
            value = " positivo.";
        } else {
            value = " negativo.";
        }

        String oddity = "";
        if (num % 2 == 0) {
            oddity = " par";
        } else {
            oddity = " ímpar";
        }

        System.out.println((int)num + " é" + oddity + " e" + value);
    }
}
