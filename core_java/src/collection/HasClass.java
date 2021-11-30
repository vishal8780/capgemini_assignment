package collection;
import java.util.*;
public class HasClass {
    public static void main(String[] args){
            HashSet hs1=new HashSet();
            hs1.add("ZA");
            hs1.add("B");
            hs1.add("C");
            hs1.add("D");
            hs1.add("E");
        System.out.println(hs1);
         HashSet hs2=new HashSet(hs1);
         System.out.println(hs2);
    }
}
