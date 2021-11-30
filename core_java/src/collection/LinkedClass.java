package collection;
import java.util.*;
public class LinkedClass {
    public static void main(String[] args){
        LinkedList LL=new LinkedList();
        LL.add("A");
        LL.add("B");
        LL.add("C");
        LL.add("D");
        LL.add("E");
        System.out.println(LL);
        LL.addFirst("X");
        LL.addLast("Z");
        System.out.println(LL);
        LL.removeFirst();
        LL.removeLast();
        System.out.println(LL);
        LL.getFirst();
        System.out.println(LL);
        LL.getLast();
        System.out.println(LL);
    }
}
