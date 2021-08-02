package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać liczbe: ");
        firstNumber = scanner.nextInt();
        if (firstNumber == 0)
        {
            System.out.println("Błedna liczba");
        }
        for (int i = 1 ; i<= firstNumber; i++)
        {
            if (firstNumber % i == 0)
            {
                System.out.println("Dzielnikami liczby:" + firstNumber + " są:" + i);

            }


        }

    }
}
