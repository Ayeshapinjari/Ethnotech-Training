package day8;

import java.util.HashMap;
import java.util.Map;

public class HashMapex {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("h1",1);
        map.put("h3",2);
        map.put("h4",0);
        map.put("h5",4);
        for(String s: map.keySet()){
            System.out.print(s+":"+map.get(s)+" ");
        }
        System.out.println(map.putIfAbsent("h2",4));
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.print(entry.getKey()+":"+entry.getValue()+" ");
        }
    }
}
