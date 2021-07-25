package homeWork10;

public class Cat extends Animal{

    String animal = "cat";
    String food = "milk";
    String location = "home";

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public String getLocation(){
        return location;
    }

    void makeMew(){
        System.out.println("Mew");
    }

    @Override
    void eat() {
        System.out.println(animal + " eats " + food);
    }


    @Override
    void makeNoise() {
        System.out.println( animal + " is making noise");
    }
}
