public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            int i =9/0;
            int a[]= new int[2];
            a[2]=3;

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException   e){
            System.err.println(e.getMessage());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("hello world");
        }

        System.out.println("hello");

        //Custom Exception
        try {
           if(1==1)
            throw  new CustomException("this Custom Exception");
        }catch (CustomException e){
            System.err.println(e.getMessage());
        }
    }
}
