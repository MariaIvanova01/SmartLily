package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ageLily = scan.nextInt();
        double washingMashinePrice = scan.nextDouble();
        int oneToyPrice = scan.nextInt();
        double savedMoneyAge = 0;
        int numToys = 0;
        int moneyToIncrement = 10;
        for (int i = 1; i <= ageLily; i ++){
            if ( i % 2 == 0){
                savedMoneyAge += moneyToIncrement;
                moneyToIncrement += 10;
            } else {
                numToys += 1;
            }
        }
        for (int i = 2;i <= ageLily;i+=2) {
            savedMoneyAge = savedMoneyAge - 1;
        }
        double priceFromToys = numToys * oneToyPrice;
        savedMoneyAge = savedMoneyAge + priceFromToys;
        if (washingMashinePrice <= savedMoneyAge) {
            System.out.printf("Yes! %.2f", savedMoneyAge - washingMashinePrice);
        } else {
            System.out.printf("No! %.2f", washingMashinePrice - savedMoneyAge);
        }
    }
}
