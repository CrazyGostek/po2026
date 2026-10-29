package agh.po.lab3;

public class CodingBat {
    public static String frontTimes(String str, int n) {
        if (str.length() > 3)
            str = str.substring(0, 3);
        String result = "";
        for (int i = 0; i < n; i++)
            result += str;
        return result;
    }

    public static boolean doubleX(String str) {
        char character = 'o';
        int index = str.indexOf(character);
        if (str.indexOf(character) != -1 && str.indexOf(character) != str.length() - 1 && str.charAt(index + 1) == character)
            return true;
        return false;
    }

    public static boolean hasBad(String str) {
        int index = str.indexOf("bad");
        if (index == 0 || index == 1)
            return true;
        return false;
    }

    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.toString(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Slopik", 5));
        System.out.println(doubleX("Sloop"));
    }
}
