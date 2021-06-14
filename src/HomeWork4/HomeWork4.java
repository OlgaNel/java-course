package HomeWork4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want?");
        int task = in.nextInt();
        switch (task) {
            case 1:
                easySolution(args);
                ;
                break;
            case 2:
                hardSolution(args);
                break;
            default:
                System.out.println("Wrong task");
        }


    }

    public static void hardSolution(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string.");
        String s = in.nextLine();
        System.out.println("Length " + s.length());

        //set length of arr without exclamation marks
        int lengthWithoutExclam = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '!') {
                lengthWithoutExclam = lengthWithoutExclam - 1;
                System.out.println("FOR  " + String.valueOf(lengthWithoutExclam));
            }
        }
        System.out.println("IIIII " + String.valueOf(lengthWithoutExclam));

        char[] newLetters = new char[lengthWithoutExclam];
        int k = 0;
        int r = 0;

        for (int j = 0; j < newLetters.length; j++) {
            if (s.charAt(k) == '!') {
                while (isNextCharExclam(s, k)) {
                    k = addIterations(k, 1);
                }
                newLetters[j] = s.charAt(addIterations(k, 1));
                k = addIterations(k, 2);
                System.out.println("111 K = " + k + "J = " + j);
                System.out.println(String.valueOf(newLetters));
            } else {
                newLetters[j] = s.charAt(k);
                k = addIterations(k, 1);
                System.out.println("222 K = " + k + "J = " + j);
                System.out.println(String.valueOf(newLetters));
            }
        }

        String resultStr = String.valueOf(newLetters);
        System.out.println("RESULT = " + resultStr);

    }

    public static int addIterations(int k, int r) {
        return k = k + r;
    }

    public static boolean isNextCharExclam(String s, int k) {
        boolean result = s.charAt(k + 1) == '!';
        return result;
    }

    public static void easySolution(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string.");
        String s = in.nextLine();
        System.out.println("Length " + s.length());

        String newString = s.replace("!", "");
        System.out.println(newString);
    }
}
