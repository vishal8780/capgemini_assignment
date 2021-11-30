package collection;

import java.util.Stack;

public class Stackclass {
    public static void main(String[] args)
    {
        Stack s= new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        s.push("E");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        boolean b=s.isEmpty();
        System.out.println(b);
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("X"));
        System.out.println(s.search("Z"));
        s.remove(2);
        System.out.println(s);
    }
}
