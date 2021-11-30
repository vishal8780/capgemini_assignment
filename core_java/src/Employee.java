public class Employee {
    int salary(){
        return 0;
    }
}
class manager extends Employee{
    int bs;
    int in;
    void set (int x,int y){
        bs = x;
        in = y;
    }
    int salary(){
        return bs+in;
    }
}
class labour extends Employee{
    int bs;
    int in;
    labour(int x,int y){
        bs = x;
        in = y;
    }
    int salary(){
        return bs+in;
    }
}
 class MyClass {
    public static void main(String[] args){
        manager xyz = new manager();
        xyz.set(1000,1000);
        labour lab1 = new labour(100,5000);
        System.out.println(xyz.salary());
        System.out.println(lab1.salary());
    }
}