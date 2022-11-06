public class Loops {

    public static void main(String[] args) {

//        int num =0;
//        while (num <=5){
//            System.out.println(num);
//            num++;
//        }
//
//        do{
//            System.out.println("do while loop");
//            num++;
//        } while (num <=5);
//
//     for(int i=0;i<5;i++){
//         System.out.println("for loop");
//
//     }

//        for(int i=1;i<=6;i++){
//            for(int j=1;j<=i;j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        for(int i=0;i<3;i++){
//
//            switch (i){
//
//                case 0:
//                    System.out.print('A');
//                    break;
//                case 1:
//                    System.out.print("A B");
//                    break;
//                case 2:
//                    System.out.print("A B C");
//                    break;
//
//            }
//
//            System.out.println();
//
//        }
//
//        for(int i=0;i<4;i++){
//
//            switch (i){
//
//                case 0:
//                    System.out.print("* * * *");
//                    break;
//                case 1:
//                    System.out.print("*     *");
//                    break;
//                case 2:
//                    System.out.print("*     *");
//                    break;
//                case 3:
//                    System.out.print("* * * *");
//                    break;
//
//            }
//
//            System.out.println();
//
//        }


        // continue and break
//        for(int i=0;i<3;i++){
//
//            if(i==0)
//                continue;
//
//            System.out.println(i);
//            break;
//
//        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                if (j == 1)
                    break;
                System.out.println(j);
            }
        }

    }
}
