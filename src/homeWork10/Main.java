package homeWork10;

public class Main {
    public static void main(String[] args) {

        Cat murka = new Cat();
        Dog barsik = new Dog();
        Horse spirit = new Horse();
        Vet veterinar = new Vet();


        Animal[] animals = {murka, barsik, spirit};
        for (Animal animal : animals) {
            System.out.println(veterinar.treatAnimal(animal));
        }
    }
}
