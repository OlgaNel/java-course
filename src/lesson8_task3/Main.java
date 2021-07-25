package lesson8_task3;

public class Main {
    public static void main(String[] args) {
        Student olga = new Aspirant("Olga", "Nelipa", "test", 4,"asd");
        Student test1 = olga;
        Student test = new Student("qwe", "qwe", "qwe", 4);
        Student[] arr = new Student[2];

        arr[0] = olga;
        arr[1] = test;
    }
}
