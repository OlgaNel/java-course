package test;

import java.util.Scanner;

public class LoginForm {
    public Boolean isLoggedIn(String login, int password) {


        String existLogin = "qwe";
        int existPassword = 123;

        if (existLogin.equals(login) && existPassword == password) {
            System.out.println("Welcome!");
            return true;
        } else {
            System.out.println("Smth went wrong");
            return false;
        }

    }
}
