package base;

/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();

        int euros = myApp.promptEuros();
        double rate = myApp.promptRate();

        double dollars = myApp.calculateDollars(euros, rate);

        myApp.printOutput(euros, rate, dollars);
    }

    public void printOutput(int euros, double rate, double dollars){
        System.out.printf("%d Euros at an exchange rate of %f is\n" +
                "%.2f U.S. dollars.", euros, rate, dollars);
    }

    public double calculateDollars(int euros, double rate){
        return euros * rate;
    }

    public int promptEuros(){
        System.out.println("How many euros are you exchanging? ");
        return in.nextInt();
    }

    public double promptRate(){
        System.out.println("What is the exchange rate? ");
        return in.nextDouble();
    }
}
