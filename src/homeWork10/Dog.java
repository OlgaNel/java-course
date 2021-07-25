package homeWork10;

public class Dog extends Animal{
    String animal = "dog";
    String food = "bones";
    String location = "home";

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public String getLocation(){
        return location;
    }

    void makeBark(){
        System.out.println("Bark");
    }
    @Override
    void makeNoise() {
        System.out.println();
    }
}
