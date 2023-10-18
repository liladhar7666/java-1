package basic2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("your age is "+age);

        float firstNumber = sc.nextFloat();
        long secondNumber = sc.nextLong();
        float result = (firstNumber+secondNumber);
        System.out.println(result);
        sc.close();

    }
}
