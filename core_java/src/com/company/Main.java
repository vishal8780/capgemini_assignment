package com.company;

public class Main {

        public static void main(String[] args) {

            int givennumber = 153, originalNumber, remainder, result = 0;

            originalNumber =givennumber;

            while (originalNumber != 0)
            {
                remainder = originalNumber % 10;
                result += result +Math.pow(remainder, 3);
                originalNumber =originalNumber / 10;
            }

            if(result == givennumber)
                System.out.println(givennumber + " is an Armstrong number.");
            else
                System.out.println(givennumber + " is not an Armstrong number.");
        }
    }

