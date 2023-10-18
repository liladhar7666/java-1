package basic2;

public class Operators {
    public static void main(String[] args) {

        int firstNumber = 12;
        int secondNumber = 45;

        int store = firstNumber + secondNumber ;
        System.out.println(store);

//        int a = 4;
//        int b = 5;
//        int c = a + b ;
////        int c = 5 + 6;
//        System.out.println(c);

        boolean brother = true;
        boolean sister = false;

        System.out.println(brother && sister);
        System.out.println(brother || sister);
        System.out.println(!brother);

        int a = 11;
        a = a + 1; //12
        a++;
        a--;
        a--; //12
        System.out.println(a);//12

        int c = 12;
        int d = 7;
          double f = c/(double)d;

        System.out.println(f);

//        a+=b// here, we can save , data in a
//        a-=b
    }

}
