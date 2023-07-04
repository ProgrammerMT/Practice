package training.day2;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void sum(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        String s = "World";
        System.out.println(s.charAt(4));
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(0,6));
        System.out.println(s.startsWith("hello"));
        s = s.concat("World");
        System.out.println(s.indexOf("World", 6));
        System.out.println(s.contains("lo"));
        System.out.println(s.replace("l", "L"));
        System.out.println(s.trim());
        System.out.println(s.substring(0,6).charAt(7));

        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = sb;
        sb.append(" World");
        System.out.println(sb);
        sb = sb.append(" World");
        System.out.println("Sb2: " + sb2);
        sb.delete(1, 5);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1, "H");
        sb.reverse();
        int[] integers = new int[3];
        int[] integers1 = {1,3};
        int[][] dvumerenMasiv = new int[1][3];
        for (int i : integers){
            System.out.println(i);
        }


        /*
        //Zadacha 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day num: ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: System.out.println("No data"); break;
        }
        //Zadacha 2
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Register");
        System.out.println("Eneter a name: ");

        String name = scanner1.nextLine();

        System.out.println("Enter a password:");
        int pass = scanner1.nextInt();


        System.out.println("Sign to your profile");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Eneter a name: ");

        String name2 = scanner2.nextLine();
        System.out.println("Enter a password: ");
        int pass2 = scanner2.nextInt();

        if (name.equals(name2) && pass == pass2) {
            System.out.println("Welcome, " + name);
        } else if (name.equals(name2) || pass == pass2) {
            System.out.println("Wrong credentials!");
            //signUP(name, pass);
            do {
                System.out.println("Sign to your profile");

                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Eneter a name: ");

                name2 = scanner3.nextLine();

                System.out.println("Enter a password: ");
                pass2 = scanner3.nextInt();
                if (name.equals(name2) && pass == pass2) {
                    System.out.println("Welcome, " + name);
                }
            } while (!(name.equals(name2)) || pass != pass2);
        }

        //Zadacha 3
        System.out.println("Enter a word: ");
        String word = scanner.next();
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        //Zadacha 4
        System.out.println("Enter the weight: ");
        int weight = scanner.nextInt();

        if (weight >= 50 && weight <= 70) {
            System.out.println("skinny");
        } else if (weight >= 71 && weight <= 90) {
            System.out.println("skinny fat");
        } else if (weight >= 90 && weight <= 110) {
            System.out.println("obese");
        } else if (weight > 111) {
            System.out.println("extra obese");
        }

        //Zadacha 5
        System.out.println("Days of the week");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (String day1 : days) {
            System.out.println(day1);
        }
*/
        //Homework
        //Zadacha 1
        String[] words = {"Алфа", "аватар", "беда", "бреза", "салон"};
        for (String word1 : words){
            if (word1.charAt(0) == 'a' || word1.charAt(0) == 'A'){
                System.out.println(word1);
            }
        }

        //Zadacha 2
        Scanner scann = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scann.nextInt();
        }
        sum(arr);

        //Zadacha 3
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            System.out.println("Write a word: ");
            list.add(scann.next());
        }

        List<String> list1 = new ArrayList<>();
        for (String input : list){
            if (input.length() >= 4){
                list1.add(input);
            }
        }

        for (String input : list1){
            System.out.println(input);
        }
    }
}