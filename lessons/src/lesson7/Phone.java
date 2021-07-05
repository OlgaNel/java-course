package lesson7;

public class Phone {
    String number = "+380999999999";
    String model = "model";
    Integer weight = 100;

    public String receiveCall(String name){
        String message = "Calling " + name;
        return message;
    }

    public String getNumber(){
        return number;
    }
}
