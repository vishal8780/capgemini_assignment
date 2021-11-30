package com.company;
import java.util.*;
public class passfail
    {
        public static void main(String[] args)
        {

            Scanner sc=new Scanner(System.in);

            double a, b, c;

            System.out.println("Enter your marks in three subjects...");

            a=sc.nextDouble();

            b=sc.nextDouble();

            c=sc.nextDouble();

            if(a>=60&&b>=60&&c>=60)


                System.out.println("You passed the exam.");
            else if(((a>=60 && b>=60 && c<60)||(a>=60 && b<60 && c>=60 ))|| (a<60 && b>=60 && c>=60))
                System.out.println("pramoted");
            //else if(((a>=60||  b<=60 && c<60 )||(b>=60 || (a<60 && c<60))|| (c>60 ||(a<60 && b<60)

                else
                System.out.println("fail ");


        }

    }

