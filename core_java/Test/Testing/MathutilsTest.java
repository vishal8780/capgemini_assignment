package Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathutilsTest {

    @Test
    void add() {
        Mathutils mathutils=new Mathutils();
        int expected=4;
        int actual=mathutils.add(3,1);
        assertEquals(expected,actual,"Add number two");
    }
    @Test
    void divide()
    {
        Mathutils mathutils=new Mathutils();
        assertThrows(ArithmeticException.class,()-> mathutils.add(1,0),"Should divide by zero");

    }
    @Test
    void computecircleArea(){
        Mathutils mathutils=new Mathutils();
        assertEquals(314.0,mathutils.computecircleArea(10),"shoud return the right value");
    }
}