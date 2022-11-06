public class SelectionStatements {


    public static void main(String[] args) {

        int num =6;

        if(num%2==0)
            System.out.println("even");
        else
            System.out.println("odd");


        String res = num%2==0? "even":"odd";

        switch (res){

            case "even":
                System.out.println("even");
                break;

            case "odd":
                System.out.println("odd");
                break;

            default:
                System.out.println("default");

        }



    }
}
