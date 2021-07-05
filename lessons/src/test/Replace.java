package test;

import java.util.Scanner;

public class Replace {
    public void task5(){
        Scanner in = new Scanner(System.in);

        System.out.println("Write a string.");
        String str = in.nextLine();

        String result = str.replace('a', '@');
        result = result.replace('o', '0');
        if (result.length() > 30) {
            System.out.println("String is too long");
        } else {
            System.out.println(result);
        }
    }
}
