package org.example;

import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("What was your deposit value?");
        double depositValue= scanner.nextDouble();

        System.out.println("What is your interest rate?");
        double interestRate= scanner.nextDouble();

        System.out.println("How old is the CD in years?");
        double cdYears= scanner.nextDouble();

        double futureValue = calculateFutureValue(depositValue, interestRate, cdYears);
        System.out.printf("The future value of your CD is: %.2f\n", futureValue);

        double totalInterest = calculateTotalInterest(futureValue, depositValue);
        System.out.printf("Your total interest is %.2f", totalInterest);


    }
    public static double calculateFutureValue (double depositValue, double interestRate, double cdYears) {
        double futureValue = depositValue * Math.pow(1 + ((interestRate/100) / cdYears), (interestRate * cdYears));
        return futureValue;
    }

    public static double calculateTotalInterest(double futureValue, double depositValue){
        double totalInterest = futureValue - depositValue;
        return totalInterest;



    }





}