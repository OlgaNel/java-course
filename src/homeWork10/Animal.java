package homeWork10;


public abstract class Animal {
    String food;
    String location;

    String getFood() {
        return food;
    }

    String getLocation(){
        return location;
    }

    void makeNoise(){
        System.out.println("animal is sleeping");
    };
     void eat(){
        System.out.println();
    };
     void sleep() {
         System.out.println();
     };
}
