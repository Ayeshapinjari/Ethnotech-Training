package collections;
import java.util.*;
public class Arraylistt {
    public static  void main(String[] args) {
 ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <=5 ; i++) {
            list.add(i);
        }
        // replace even with zero
//        for(int n:list){
//            if(n%2==0){
//                list.set(list.indexOf(n),0);
//            }
//        }
        list.add(2);
        list.add(3);
        list.add(4);
        HashMap<Integer,Integer> map=new HashMap<>();
        //count frequency
        for(int n:list){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>1){
                list.remove(e.getKey());
            }
        }

        System.out.println(list);
    }
}
