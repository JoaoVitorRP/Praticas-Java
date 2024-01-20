import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insira a quantidade de linhas que a pirâmide deve ter:");
        double pickedNumber = reader.nextDouble();

        while (pickedNumber <= 1 || pickedNumber != (int) pickedNumber) {
            System.out.println("Número inválido! Escolha um número inteiro e maior que um:");
            pickedNumber = reader.nextDouble();
        }

        reader.close();

        String pyramid = "1\n22";
        for (int i = 3; i <= pickedNumber; i++) {
            String currentLine = "\n" + (int) i;

            while (currentLine.length() <= i) {
                currentLine += (int) i;
            }

            pyramid += currentLine;
        }

        System.out.println("\nResultado:");
        System.out.println(pyramid);
    }
}
