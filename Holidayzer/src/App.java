import java.util.Scanner;

public class App {
    public static void GetAllHolidays(Holiday[] holidaysArr) {
        System.out.println("\n------------------------------- Feriados: -------------------------------\n");
        for (int i = 0; i < holidaysArr.length; i++) {
            holidaysArr[i].getHoliday();
        }
        System.out.println("\n-------------------------------------------------------------------------\n");
    }

    public static void CheckDate(Holiday[] holidaysArr, String date) {
        for (int i = 0; i < holidaysArr.length; i++) {
            if (date.equals(holidaysArr[i].getDate())) {
                String name = holidaysArr[i].getName();
                System.out.println("\nDia " + date + " é " + name + "! 🎉");
                return;
            }
        }

        System.out.println("\nDia " + date + " não é feriado 🥲");
    }

    public static void main(String[] args) throws Exception {
        String[] datesArr = { "01-01-2024", "12-02-2024", "13-02-2024", "29-03-2024", "21-04-2024", "01-05-2024",
                "30-05-2024", "07-09-2024", "12-10-2024", "02-11-2024", "15-11-2024", "20-11-2024", "25-12-2024" };
        String[] namesArr = { "Confraternização Mundial", "Carnaval", "Carnaval", "Sexta-feira Santa", "Tiradentes",
                "Dia do Trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados",
                "Proclamação da República", "Dia Nacional de Zumbi e da Consciência Negra", "Natal" };

        Holiday[] holidaysArr = new Holiday[namesArr.length];

        for (int i = 0; i < namesArr.length; i++) {
            holidaysArr[i] = new Holiday(datesArr[i], namesArr[i]);
        }

        Scanner reader = new Scanner(System.in);
        System.out.println("\nCaso deseje obter uma lista de todos os feriados, digite 'lista' (sem as aspas)");
        System.out.println("Caso deseje saber se uma data específica é feriado, digite a data no formato DD-MM-2024");
        String userInput = reader.nextLine();

        while (!(userInput.equalsIgnoreCase("lista") || userInput.contains("-2024"))) {
            System.out.println("\nInput inválido! Por favor, tente novamente");
            System.out.println("\nCaso deseje obter uma lista de todos os feriados, digite 'lista' (sem as aspas)");
            System.out.println(
                    "Caso deseje saber se uma data específica é feriado, digite a data no formato DD-MM-2024");
            userInput = reader.nextLine();
        }

        reader.close();

        if (userInput.equalsIgnoreCase("lista")) {
            GetAllHolidays(holidaysArr);
        } else if (userInput.contains("-2024")) {
            CheckDate(holidaysArr, userInput);
        }
    }
}
