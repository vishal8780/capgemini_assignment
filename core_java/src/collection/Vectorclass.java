package collection;
import java.util.*;
public class Vectorclass {
    public static void main(String[] args){
        Vector vl=new Vector();
        vl.add("A");
        vl.add("B");
        vl.add("c");
        vl.add("D");
        vl.add("E");
        System.out.println(vl);
        System.out.println("Vector list size  are :"+vl.size());
        System.out.println(vl.firstElement());
        System.out.println(vl.lastElement());
        System.out.println(vl.elementAt(3));
        vl.removeElement("D");
        System.out.println(vl);
        vl.removeElementAt(2);
        System.out.println(vl);



    }
}
