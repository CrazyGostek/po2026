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

    public static String printNumbers(ArrayList<Integer> numbers) {
        String result = "";
        result += "[";
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
            if (i != numbers.size() - 1)
                result += ", ";
        }
        result += "]\n";
        return result;
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
        System.out.printf("Wylosowano zwycięskie liczby po %s próbach: %s", rerolls, printNumbers(yourNumbers));
        System.out.printf("Zajęło to %fs\n", (endTime - startTime) / Math.pow(10, 9));
    }

    public static void main(String[] args) {
        ArrayList<Integer> yourNumbers = new ArrayList<>(), yourNumbersCopy;
        for (String arg : args) {
            int number = Integer.parseInt(arg);
            if (number < 1 || number > 49) {
                System.out.println("Wprowadzono złe liczby!");
                return;
            }
            yourNumbers.add(number);
        }
        yourNumbersCopy = new ArrayList<>(yourNumbers);

        System.out.printf("Twoje liczby: %s", printNumbers(yourNumbersCopy));
        ArrayList<Integer> generatedNum = generate(6);
        System.out.printf("Wylosowane liczby: %s", printNumbers(generatedNum));
        yourNumbers.retainAll(generatedNum);
        System.out.printf("Liczba trafień: %s\n\n", yourNumbers.size());
        yourNumbers.clear();
        win(yourNumbersCopy);
    }
}
