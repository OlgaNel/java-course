package lesson7;

public class main {
    public static void main(String[] args) {
        Phone nokia = new Phone();
        Phone samsung = new Phone();
        Lg lg = new Lg();

        lg.receiveCall("name1", "name2");
        lg.receiveCall("asd");


        /*System.out.println(samsung.model);
        System.out.println(nokia.weight);
        System.out.println(lg.model);*/
    }
}
