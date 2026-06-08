package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
//Arraylist methods
public class ArrList {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>(10);
        System.out.println(list.size());// it gives 0
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);// add at end
        list.add(0,0);// add at index
        System.out.println(list);
        list.remove(2);
        list.add(0);
        list.remove(Integer.valueOf(0));// remove first ocurred value
        list.set(4,6);// replace val in 4th index with 6
        //TRAVERSAL
        for(int x: list){
            System.out.print(x+" ");
        }
        System.out.println();
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){// check empty or not
            System.out.print(it.next());
        }
        System.out.println(list.contains(6));
        System.out.println(list.indexOf(6));
        list.add(6);
        list.add(6);
        System.out.println(list.lastIndexOf(6));
        //System.out.println(Collections.sort(list));
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        // Arraylist to array
        Integer[] arr=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));
        // Arrayb to Arraylist
        ArrayList <Integer> list2=new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list2);
        System.out.println(list2);

    }
}
