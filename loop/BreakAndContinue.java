package loop;

public class BreakAndContinue {
    public static void main(String[] args) {
//        for(int i = 0; i <= 20; i+=2){
//            System.out.println(i);
//            if(i >= 10)break;
//        }
//
//        for(int i = 0; i <= 20; i+=1){
//            if (i == 2 || i == 8) continue;
//            if(i >= 12)break;
//            System.out.println("gave tofee to"+i);
//        }
//
//
//        int i = 0;
//        while (i <= 5) {
//            System.out.println(i);
//            i++;
//            if(i == 3)break;
//        }

//       for(int count = 0; count <= 10; count++){
//           for(int i = 1; i <= 5; i++){
//               System.out.print(i+" ");
//           }
//           System.out.println("printed"+count);
//       }

        for(int i = 0; i < 18; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        outerLoop:
        for(int i = 0; i<10; i++) {
            int j = 0;
            while(j <= 5) {
                if(j == 3) break outerLoop;
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
        }


    }
}
