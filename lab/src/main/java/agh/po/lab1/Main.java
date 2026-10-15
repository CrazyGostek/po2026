package agh.po.lab1;

import agh.po.lab2.Lotto;

public class Main {
    public static void hello() {
        System.out.println("Hello, World!");
    }

    public static void tree(int height) {
        int row_len=1,spaces=height;
        for (int i = 0; i < height; i++) {
            int j=0;
            while(j<spaces){
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<row_len){
                System.out.print("#");
                j++;
            }
            spaces--;
            row_len+=2;
            if (height - 1 == i) return;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        hello();
        System.out.println();
//        System.out.print("Podaj wysokość choinki: ");
//        Scanner scanner = new Scanner(System.in);
//        int height = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(args[0]);
        System.out.println("Zadanie 2:");
        tree(height);
        System.out.println();
        System.out.println();
    }

}