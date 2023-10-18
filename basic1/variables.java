package basic1;

public class variables {
    public static void main(String[] args) {

        boolean isPassed = true;
        int count = 15;
        byte countInt = (byte)count;

        System.out.println(countInt);

        long countF = 12;
        int countIntF = (int)countF;

        System.out.println(countF);

//        byte marks = 129; //we can'not store out of the range of byte

        byte marks = 12;
        short person = 23;

        float pi = 12.6f;

        float secondPi = 3.14f;

        System.out.println(pi);
        System.out.println(secondPi);

        double num = 456456d;

        char myLetter = 'a';
        System.out.println(myLetter);

        int age = 125;
        byte newAge = (byte)age;//typecasting

        System.out.println(newAge);



    }
}