package collection;

import java.util.HashSet;
import java.util.*;
public class HasClass2 {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();
        hs1.add("ZA");
        hs1.add("B");
        hs1.add("C");
        hs1.add("D");
        hs1.add("E");
        System.out.println(hs1);
        hs1.add("B");
        System.out.println(hs1);
        hs1.add("null");
        hs1.add("null");
        System.out.println(hs1);
        hs1.add(new Integer(10));
        System.out.println(hs1);
    }

}
