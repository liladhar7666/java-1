package conditionalStatement;

//import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your age");
//        int age = sc.nextInt();
////        int age = 22;
//        if (age > 18) {
//            System.out.println("you can vote ");
//            System.out.println("you are eligible");
//        }else{
//            System.out.println("you cannot vote");
//        }
//
//        int day = 3;
//        if(day == 1){
//            System.out.println("go to home ");
//        }else if(day == 2){
//            System.out.println("go to the gym");
//        }else if(day == 3){
//            System.out.println("go to the party");
//        }else{
//            System.out.println("go to the office ");
//        }
//        System.out.println("went somewhwere today");
//    }

        //you are given three numbers , find the maximum number
//        int a = 2;
//        int b = 3;
//        int c = 4;
//
//        if (a > b) {
//            System.out.println("a is greater than b");
//            if (a > c) {
//                System.out.println(" a is greater than c");
//                System.out.println("a is largest " + a);
//            } else {
//                System.out.println("c is grater than a");
//                System.out.println("c is greater" + c);
//            }
//        }
//        else{
//                System.out.println("b is greater than a ");
//               if(b > c) {
//                   System.out.println("b is grater than c");
//                   System.out.println("b is greater"+b);
//               }else{
//                   System.out.println("c is greater than b");
//                   System.out.println("c is greater"+c);
//               }
//            }
//

//            int a = 26;
//            int b = 23;
//            int c = 45;
//            int max = 0;
//
//              if(a > b){
//                  max = a;
//              }else{
//                  max = b;
//              }
//
//         max = a > b ? a > c ? a : c : b > c ? b : c;
//
//        System.out.println("value of max"+max);

        int time = 18;

          if(time >= 10) {
              if (time <= 23) {
                  System.out.println("office is open");
              } else {
                  System.out.println("office is closed");
              }
          }
          else{
              System.out.println("office is closed");
          }


        if(time >= 10 && time <= 20){
            System.out.println("office is open");
        }else{
            System.out.println("office is closed ");
        }

        if(time == 12 || time == 18){
            System.out.println(" time for snacks");
        }else{
            System.out.println(" time for work");
        }

        }
}


