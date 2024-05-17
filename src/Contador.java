import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro parâmetro: ");
        int param1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o segundo parâmetro: ");
        int param2 = scanner.nextInt();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {

        if (param1 >= param2) {
            throw new ParametrosInvalidosException();
        }

        int index = param2 - param1;
        for (int i = 1; i <= index; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
