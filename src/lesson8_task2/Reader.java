package lesson8_task2;

import java.util.Arrays;

public class Reader extends Book{
    FullName fullName = new FullName("Olga", "Nelipa");
    int numberTicket;
    String faculty;
    String birthDate;
    String phoneNumber;


    public void takeBook(int numberOfBooks){
        System.out.println(fullName.name + " " + fullName.surname+ " took " + numberOfBooks + " books");
    }
    public void takeBook(String[] args){
        System.out.println(fullName.name + " took " + Arrays.toString(args));
    }
    public void takeBook (){
        System.out.println(fullName.name + " took " + this.authorName);
    }

    public void returnBook(String[] args){
        System.out.println(fullName.name + " took " + Arrays.toString(args));
    }
}
