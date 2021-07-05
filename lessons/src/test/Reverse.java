package test;

import java.util.Scanner;

public class Reverse {
    public void task3(){
        Scanner in = new Scanner(System.in);
        System.out.println("Write a string.");
        String str = in.nextLine();

        String[] arrStr = str.split("");
        String[] newArrStr = new String[arrStr.length];
        int length = arrStr.length;
        String res = "";
        int j = 0;

        for(int i = arrStr.length-1; i > 0; i--){
            while(j < length){
                newArrStr[j] = arrStr[i];
                res = res + newArrStr[j];
                j++;
                i--;
            }

        }

        System.out.println(res);

    }
}
