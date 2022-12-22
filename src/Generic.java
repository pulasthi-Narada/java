
import java.util.ArrayList;
import java.util.List;

/**
 * @author pulasthi narada
 */

class ResponseDto<T,K,N extends Number>{
    private T payLoad;
    private N count;
    private String message;
    private K status;

    public T getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(T payLoad) {
        this.payLoad = payLoad;
    }

    public N getCount() {
        return count;
    }

    public void setCount(N count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public K getStatus() {
        return status;
    }

    public void setStatus(K status) {
        this.status = status;
    }
}
public class Generic {
  // without Generic
  private   List abc = new ArrayList();
  private   List<String> abcd = new ArrayList();

  public  void test2(List<?> myList){
      System.out.println(myList.toString());
  }
    public  <T> void test3(T name){
        System.out.println(name);
    }

  public void test(){
        abc.add(1);
        abc.add("abc");
        abcd.add("w");
       test2(new ArrayList<String>());

        ResponseDto<List<Object>,Integer,Integer> responseDto = new ResponseDto<>();
        responseDto.setCount(0);
        responseDto.setMessage("");
        responseDto.setPayLoad(new ArrayList<>());
  }

}
