import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escolha o tamanho da sequência Fibonacci desejada:");
        double pickedNum = reader.nextDouble();

        while (pickedNum <= 0 || pickedNum != (int) pickedNum) {
            System.out.println("Número inválido! Escolha um número inteiro maior que zero:");
            pickedNum = reader.nextDouble();
        }

        reader.close();

        String sequence = "0 1";

        if (pickedNum == 1)
            sequence = "0";

        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 2; i < pickedNum; i++) {
            int sum = firstNumber + secondNumber;
            sequence += " " + sum;
            firstNumber = secondNumber;
            secondNumber = sum;
        }

        System.out.println("\nA sequência Fibonacci de tamanho escolhido é:");
        System.out.println(sequence);
    }
}
