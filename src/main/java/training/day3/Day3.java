package training.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Day3 {
    //Homework
    //Zadacha 1
    public static void zadacha1(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        } else if (third < min) {
            min = third;
        }
        System.out.println(min);
    }

    public static void zadacha2() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = scann.nextInt();
        if (num % 2 == 0) {
            System.out.println(true);
        } else if (num % 2 != 0) {
            System.out.println(false);
        }
    }

    public static void zadacha1() {
        Scanner scann = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number: ");
            int num = scann.nextInt();
            arr[i] = num;
        }

        System.out.println("Positive numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Negative numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Odd numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Number of 5: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void zadacha2(String str1, String str2) {
        System.out.println(str1.replace(str2, ""));
    }

    public static void zadacha3(String str) {
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void zadacha4(String name) {
        String[] words = name.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i].charAt(0));
        }

    }

    public static void zadacha5(ArrayList<String> list) {
        String first = list.get(0);
        String last = list.get(list.size() - 1);
        list.set(0, last);
        list.set(list.size() - 1, first);

        for (String words : list) {
            System.out.println(words);
        }
    }

    public static void main(String[] args) {
        zadacha1();

        String str1 = "Plovdiv";
        String str2 = "lo";
        zadacha2(str1, str2);

        String name = "Ivan Ivanov Ivanov";
        zadacha3(name);

        zadacha4(name);

        ArrayList<String> list = new ArrayList();
        list.add("Ivan");
        list.add("GEorgi");
        list.add("New");
        list.add("Last");
        list.add("More");
        zadacha5(list);

        Scanner scann = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int first = scann.nextInt();
        int second = scann.nextInt();
        int third = scann.nextInt();
        //Homework
        zadacha1(first, second, third);
        zadacha2();
    }
}
