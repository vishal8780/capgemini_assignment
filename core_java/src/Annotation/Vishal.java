package Annotation;
import java.util.*;
class JdbcApp {
    public void getDriver()
    {  System.out.println("Type-1 Driver");
    }
}
class New_JdbcApp extends JdbcApp {
}
public  class Vishal{
    public static void main(String args[]) {
        JdbcApp app = new New_JdbcApp();
        app.getDriver();
    }
}