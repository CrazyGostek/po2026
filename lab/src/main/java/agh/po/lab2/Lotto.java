package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    private static ArrayList<Integer> generate(int length) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int number;
        for (int i = 0; i < length; i++) {
            number = random.nextInt(1, 49);
            if (!numbers.contains(number))
                numbers.add(number);
            else
                i--;
        }
        return numbers;
    }

    public static void print_numbers(ArrayList<Integer> numbers) {
        System.out.print("[");
        for(int number : numbers) {
            System.out.print(number);
            if(number != numbers.getLast())
                System.out.print(", ");
        }
        System.out.print("]\n");
    }

    public static void win(ArrayList<Integer> yourNumbers){
        double startTime = System.nanoTime();
        ArrayList<Integer> generatedNum = generate(6);
        while(generatedNum.size()!=6){
            generatedNum.retainAll(yourNumbers);
            if(generatedNum.size()==6)
                break;
            generatedNum = generate(6);
        }
        double endTime = System.nanoTime();
        System.out.print("Wylosowano zwycięskie liczby: ");
        print_numbers(yourNumbers);
        System.out.printf("Zajęło to %e", endTime-startTime);
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> yourNumbers = new ArrayList<>();
        for (String arg : args) yourNumbers.add(Integer.parseInt(arg));
        System.out.print("Twoje liczby: ");
        print_numbers(yourNumbers);
        System.out.print("Wylosowane liczby: ");
        ArrayList<Integer> generatedNum = generate(6);
        print_numbers(generatedNum);
        yourNumbers.retainAll(generatedNum);
        System.out.println(("Liczba trafień: "+yourNumbers.size()));
        System.out.println();
        yourNumbers.clear();
        for (String arg : args) yourNumbers.add(Integer.parseInt(arg));
        win(yourNumbers);
    }
}
