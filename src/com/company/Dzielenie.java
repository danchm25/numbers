package com.company;

import java.util.Scanner;

public class Dzielenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scanner.nextInt();
        System.out.println("Podaj dzielnik: ");
        int divider = scanner.nextInt();
        int result = 0;
        int rest = number;
        while (rest >= result)
        {
            result++;
            rest = rest - divider;
        }
        System.out.println("Wynik dzielenia wynosi " + result);
        System.out.println("Reszta z dzielenia wynosi " + rest);


    }
}
