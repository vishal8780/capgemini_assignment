package collection;

import java.util.TreeSet;

public class SetClass {
public static void main(String[] args){
    TreeSet ts=new TreeSet();
    ts.add("AAA");
    ts.add("BBB");
    ts.add("CCC");
    ts.add("DDD");
    ts.add("EEE");
    System.out.println(ts);
    System.out.println(ts.first());
    System.out.println(ts.last());
    System.out.println(ts.headSet("DDD"));
    System.out.println(ts.subSet("AAA","CID"));




}


}

