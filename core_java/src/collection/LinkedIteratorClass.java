package collection;
import java.util.*;
public class LinkedIteratorClass {
    public static void main(String[] args)
 {
         LinkedList ll=new LinkedList();
         ll.add("A");
         ll.add("B");
         ll.add("C");
         ll.add("D");
         ll.add("E");
         ll.add("F");
         System.out.println(ll);
         ListIterator lit=ll.listIterator();
         while(lit.hasNext())
             {
             String element=(String)lit.next();
             if(element.equals("B"))
                 {
                 lit.add("X");
                 }
             if(element.equals("D"))
                 {
                 lit.set("Y");
                 }
             if(element.equals("E"))
                 {
                 lit.remove();
                 }
             }
         System.out.println(ll);
         }
}
