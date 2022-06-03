package org.example;

import java.util.Scanner;

public class Hangman {

    private static String[] words = {"gubbe", "kärring", "databord", "mjölk", "polis", "klor" };
    private static String word = words[(int) (Math.random() * words.length)];
    private static String unkown = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 7 && unkown.contains("*")) {
            System.out.println("Guess any letter in the word");
            System.out.println(unkown);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newUnknown = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newUnknown += guess.charAt(0);
            } else if (unkown.charAt(i) != '*') {
                newUnknown += word.charAt(i);
            } else {
                newUnknown += "*";
            }
        }

        if (unkown.equals(newUnknown)) {
            count++;
            hangmanImage();
        } else {
            unkown = newUnknown;
        }
        if (unkown.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Fel");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|\\__");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Fel");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|\\__");
        }
        if (count == 3) {
            System.out.println("Fel");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|\\__");
        }
        if (count == 4) {
            System.out.println("Fel");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|\\__");
        }
        if (count == 5) {
            System.out.println("Fel");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|\\__");
        }
        if (count == 6) {
            System.out.println("Fel");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|\\__      /   \\");
        }
        if (count == 7) {
            System.out.println("Slut, du förlorade!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|\\__      /   \\");
            System.out.println("Slut på spelet! Ordet var " + word);
        }
    }
}