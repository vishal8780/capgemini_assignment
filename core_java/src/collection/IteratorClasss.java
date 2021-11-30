package collection;
import java.util.*;
public class IteratorClasss {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("J");
        System.out.println(al);
        Iterator it = al.iterator();
        while (it.hasNext()) {
            String element = (String) it.next();
            System.out.println(element);
            if (element.equals("C")) {
                it.remove();
            }
        }
        System.out.println(it);
    }
}