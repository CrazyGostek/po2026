import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    private static ArrayList<Integer> generate(int length) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int number;
        for (int i = 0; i < length; i++) {
            number = random.nextInt(1,49);
            if(!numbers.contains(number))
                numbers.add(number);
            else
                i--;
        }
        return numbers;
    }

    public static void print_numbers(int length) {
        ArrayList<Integer> numbers = generate(length);
        System.out.print("Wylosowane liczby: ");
        for(int i=0;i<length;i++)
            System.out.print(numbers.get(i)+" ");
    }
}
