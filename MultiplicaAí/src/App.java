import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Escolha o número que desejas saber a tabela de multiplicação:");
        double pickedNum = reader.nextDouble();
        reader.close();

        String table = "Tabela de multiplicação por " + pickedNum + ":";
        for (int i = 1; i <= 10; i++) {
            double result = pickedNum * i;
            table += "\n" + pickedNum + " x " + i + " = " + result;
        }

        System.out.println("\n" + table);
    }
}
