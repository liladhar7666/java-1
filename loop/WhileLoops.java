package loop;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean hasLearnt = false;

        while(!hasLearnt){
            System.out.println("went to school, tried to learn ");
            System.out.println("have you understand?");
            hasLearnt = sc.nextBoolean();
        }

        int i = 4;
//           while(i <= 5){
//               System.out.println(i);
//               i++;
//           }

           do {
               System.out.println(i);
               i++;
           }while(i <= 2);
        System.out.println("out of the loop");
    }
}
