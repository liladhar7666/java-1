package loop;

import java.util.Scanner;

public class learnLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        for (int i = 1; i <= 10;i++ ){
            System.out.println(n+"*"+i+" = "+i*n);
        }

        //1+2+3+4+5 = 15
        int sum = 0;
        for(int i = 1; i <= n; i++){
//            sum = sum + i;
            sum += 2*i;
        }
        System.out.println("sum is "+sum);
    }
}
