package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    private static ArrayList<Integer> generate(int length) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int number;
        for (int i = 0; i < length; i++) {
            number = random.nextInt(1, 50);
            if (!numbers.contains(number))
                numbers.add(number);
            else
                i--;
        }
        return numbers;
    }

    public static void printNumbers(ArrayList<Integer> numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i != numbers.size() - 1)
                System.out.print(", ");
        }
        System.out.print("]\n");
    }

    public static void win(ArrayList<Integer> yourNumbers) {
        double startTime = System.nanoTime();
        int rerolls = 0, matches = 0;
        ArrayList<Integer> generatedNum = generate(6);
        while (true) {
            rerolls++;
            for (int num : yourNumbers)
                if (generatedNum.contains(num))
                    matches++;
            if (matches == 6)
                break;
            matches = 0;
            generatedNum = generate(6);
        }
        double endTime = System.nanoTime();
        System.out.printf("Wylosowano zwycięskie liczby po %s próbach: ", rerolls);
        printNumbers(yourNumbers);
        System.out.printf("Zajęło to %fs\n", (endTime - startTime) / Math.pow(10, 9));
    }

    public static void main(String[] args) {
        ArrayList<Integer> yourNumbers = new ArrayList<>(),yourNumbersCopy;
        for (String arg : args) {
            int number = Integer.parseInt(arg);
            if (number < 1 || number > 49) {
                System.out.println("Wprowadzono złe liczby!");
                return;
            }
            yourNumbers.add(number);
        }
        yourNumbersCopy = new ArrayList<>(yourNumbers);

        System.out.print("Twoje liczby: ");
        printNumbers(yourNumbers);
        System.out.print("Wylosowane liczby: ");
        ArrayList<Integer> generatedNum = generate(6);
        printNumbers(generatedNum);
        yourNumbers.retainAll(generatedNum);
        System.out.printf("Liczba trafień: %s\n\n", yourNumbers.size());
        yourNumbers.clear();
        win(yourNumbersCopy);
    }
}
