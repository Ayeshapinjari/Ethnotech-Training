package generics.project;

import java.util.List;
//myListDisplay(List.of(1,2,3,4,5));
public class Wildcard {
    public static void myListDisplay(List<?> l){
        System.out.println(l);
    }
    public static void main(String[] args) {
        myListDisplay(List.of(1,2,3,4,5));
        myListDisplay(List.of("Ayesha","P"));

    }
}
