package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać liczbe: ");
        number = scanner.nextInt();
        int firstPrimeNumber = 2;
        if (number == 0)
        {
            System.out.println("Błedna liczba");
        }
       while (number > 1)
       {
        if (number % firstPrimeNumber == 0)
        {
            number = number / firstPrimeNumber;
            System.out.println(firstPrimeNumber);

        }
        else
        {
            firstPrimeNumber = firstPrimeNumber + 1;
        }
       }

    }
}
