import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Para listas diferentes, modificar estes arrays:
        String[] array1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        String[] array2 = { "Manga", "Caqui", "Morango", "Amora" };

        List<String> repeatedStrings = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int n = 0; n < array2.length; n++) {
                if (array1[i] == array2[n] && !repeatedStrings.contains(array1[i])) {
                    repeatedStrings.add(array1[i]);
                }
            }
        }

        System.out.println("Valores repetidos encontrados:\n" + repeatedStrings);
    }
}
