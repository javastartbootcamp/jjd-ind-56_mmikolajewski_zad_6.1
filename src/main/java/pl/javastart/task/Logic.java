package pl.javastart.task;

import java.util.Scanner;

public class Logic {
    public void enterNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int i = 0;
        do {
            System.out.println("Podaj liczbę ");
            number = scanner.nextInt();

            if (number < 100) {
                System.out.println("liczba jest za mała");
            } else if (number > 200) {
                System.out.println("Podana liczba jest za duża");
            } else if (number % 3 == 0) {
                System.out.println("Twoja liczba jest ok");
                i++;
            } else {
                System.out.println("Twoja liczba nie jest podzielna przez 3");
            }
        } while (i != 1);
    }
}