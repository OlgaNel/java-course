package test;
import java.util.*;
import java.util.Scanner;

public class Fibonacci {
    public void task4(){
        long item = 0;
        Stack<Long> array = new Stack<Long>();
        array.push(0L);
        array.push(1L);
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        for (int i = 1; i < 100; i++){
            item = array.get(i) + array.get(i-1);
                array.push(item);


            System.out.println(array.get(i+1));

        }
    }
}
