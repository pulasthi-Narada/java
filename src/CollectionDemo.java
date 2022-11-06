import java.util.*;

 class Zxy{


}

public class CollectionDemo {

    public static void main(String[] args) {
        Collection values = new ArrayList();

        values.add(1);
        values.add(2);
        values.add(3);

        Iterator it = values.iterator();

        while (it.hasNext()){

            System.out.println(it.next());
        }
        //list
        List items = new ArrayList();
        items.add(0);
        items.add(1,1);
        items.add(2,"name");

        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }

        for (Object item : items) {
            System.out.println(item);
        }


        //list generics
        List<Integer> items2 = new ArrayList();
        items2.add(0);
        items2.add(1,1);


        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i));
        }

        for (Integer item : items2) {
            System.out.println(item);
        }

        Collections.sort(items2);
        Collections.reverse(items2);
        Collections.shuffle(items2);

        //Set

        Set<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(1);

        Set<Integer> num2 = new TreeSet<>();

        num2.add(23);
        num2.add(3);
        num2.add(45);
        num2.add(23);

        //map

        Map<String, String> map = new HashMap<>();

        map.put("name","pulasthi");
        map.put("age","25");
        map.put("name","narada");

        Set<String> keys = map.keySet();

        for(String key:keys){

            System.out.println(map.get(key));
        }
      // Hashtable is synchronized
        Map<String, String> map2 = new Hashtable<>();

        Map<String,Zxy> map3 = new Hashtable<>();

        map2.put("name","pulasthi");
        map2.put("age","25");
        map2.put("name","narada");

        Set<String> keys2 = map2.keySet();

        for(String key:keys2){

            System.out.println(map.get(key));
        }



    }
}
