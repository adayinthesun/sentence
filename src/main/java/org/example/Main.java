package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SentenceChecker sentenceChecker = new SentenceChecker();
        Scanner input = new Scanner(System.in);
        String inputSentence = "";

        System.out.println("Please enter a sentence to validate ");
        inputSentence = input.nextLine();

        do {
            boolean isSentenceValid = sentenceChecker.checkSentence(inputSentence);
            if (isSentenceValid) {
                System.out.println("This sentence is valid as per the rules.");
            } else {
                System.out.println("This sentence is invalid as per the rules.");
            }
            System.out.println("Please enter another sentence (or press X to exit the application)");
            inputSentence = input.nextLine();
        } while (!inputSentence.equalsIgnoreCase("X"));

        input.close();
    }

}