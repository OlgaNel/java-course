package homeWork10;

public class Horse extends Animal{
    String animal = "horse";
    String food = "apples";
    String location = "garden";

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public String getLocation(){
        return location;
    }
    @Override
    void makeNoise() {
        System.out.println(animal + " is making noise");
    }
}
