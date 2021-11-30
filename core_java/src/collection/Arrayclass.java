package collection;
import java.util.*;

public class Arrayclass {
    public static void main(String[] args){
        ArrayList al= new ArrayList();
        al.add("A");
        al.add("B");
        al.add("c");
        al.add("D");
        al.add("E");
        System.out.println(al);
       al.add("B");
       System.out.println(al);
       al.add(new Integer(10));
       System.out.println(al);
       al.add(null);
       al.add(null);
       System.out.println(al);

    }

}
