package com.company;

import java.util.Scanner;

public class Baletnica {
    public static void main(String[] args) {
        System.out.println("Wprowadz liczbe sekund: ");
        Scanner scanner = new Scanner(System.in);
        int secounds = scanner.nextInt();
        int piruet = 0;
        for (int i = secounds; i>=1; i--)
        {
            if(i % 2 ==0)
            {
                piruet++;
            }
        }
        System.out.println("W czasie: " + secounds + " sekun" + " wykonano " + piruet + " piruetów");
    }
}
