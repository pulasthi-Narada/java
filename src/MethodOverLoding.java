class Cal{

    public void plus(int n, int n2){

        System.out.println( n+n2);
    }

    public void plus(int n, Double n2){

        System.out.println( n+n2);
    }

    public void plus(int n, int n2,int n3){

        System.out.println( n+n2+n3);
    }


}

public class MethodOverLoding {

    public static void main(String[] args) {

        Cal c = new Cal();

        c.plus(1,3);
        c.plus(1,3.4);
        c.plus(1,2,4);

    }

}
