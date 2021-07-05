package test;

import java.util.Scanner;

public class EvenNumber {
    public String task1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Even Number. Write any integer number.");
        int number = in.nextInt();

        String res = number % 2 == 0 ? "It is even!" : "It is odd!";
        System.out.println(res);
        return res;
    }
}
