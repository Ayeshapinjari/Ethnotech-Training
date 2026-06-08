package day8;

import java.util.HashSet;
import java.util.LinkedHashSet;

// Hash set - no duplicates order doesnt matter
// linkedhashset no duplicates order matters
public class Hashsetex {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Vijji");
        hs.add("deva");
        hs.add("ayshu");
        System.out.println(hs);
        LinkedHashSet<String> ls=new LinkedHashSet<>();
        ls.add("Ayesha");
        ls.add("Arfan");
        System.out.println(ls);
    }
}
