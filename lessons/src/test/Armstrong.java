package test;
import java.util.Scanner;

public class Armstrong {
    public String task2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Armstrong. Write an integer number.");
        int number = in.nextInt();

        String strNumber = String.valueOf(number);

        String[] arr = strNumber.split("");
        int count = arr.length;
        int res = 0;

        for (int i = 0; i < arr.length; i++){
            int j = Integer.parseInt(arr[i]);
            int pow = (int) Math.pow(j, count);
            res = res + pow;
            System.out.println(pow);
        }

        String result = res == number ? "Yes!" : "No!";
        System.out.println(res);
        System.out.println(result);

        return result;
    }
}
