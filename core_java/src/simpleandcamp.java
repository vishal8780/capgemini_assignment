import java.util .*;
public class simpleandcamp {
    public static void main(String[] args)
    {
        double price,simple,comp,time,rate;
        Scanner sc=new Scanner(System.in);
                System.out.println("Eneter the price");
        price=sc.nextDouble();
        System.out.println("Eneter the  year");
        time=sc.nextDouble();
        System.out.println("Eneter the rate of intrest");
        rate=sc.nextDouble();
        simple=(price*time*rate)/100;
        comp=price*Math.pow(1.0+rate/100,time)-price;
        System.out.println("simple intrest="+simple);
        System.out. println("Compound Interest="+comp);
    }
}
