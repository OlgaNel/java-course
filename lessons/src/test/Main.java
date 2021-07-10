package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Login");
        String login = in.nextLine();
        System.out.println("Password");
        int password = in.nextInt();

        LoginForm user = new LoginForm();
        if (user.isLoggedIn(login, password)){
            System.out.println("Which task do you want?");
            int taskNumber = in.nextInt();
            switch (taskNumber) {
                case 1:
                    EvenNumber task1 = new EvenNumber();
                    task1.task1();
                    break;

                case 2:
                    Armstrong task2 = new Armstrong();
                    task2.task2();
                    break;
                case 3:
                    Reverse task3 = new Reverse();
                    task3.task3();
                    break;
                case 4:
                    Fibonacci task4= new Fibonacci();
                    task4.task4();
                    break;
                case 5:
                    Replace task5 = new Replace();
                    task5.task5();
                    break;
                default:
                    System.out.println("Wrong task.");
            }
        }


    }


}
