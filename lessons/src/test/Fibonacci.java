package test;

import java.util.Scanner;

public class Fibonacci {
    public void task4(){
        for (int i = 0; i < 50; i++){
            if(i == 0 || i == 1){
                System.out.println(i);
            } else if((i-1)+(i-2) == i){
                System.out.println(i);
            }
        }
    }
}
