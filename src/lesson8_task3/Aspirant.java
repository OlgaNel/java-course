package lesson8_task3;

public class Aspirant extends Student{
    String scienceWork;

    public Aspirant(String firstName, String lastname, String group, double averageMark, String scienceWork) {
        super(firstName, lastname, group, averageMark);
        this.scienceWork = scienceWork;
    }


}
