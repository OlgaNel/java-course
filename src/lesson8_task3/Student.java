package lesson8_task3;

public class Student {
    String firstName;
    String lastname;
    String group;
    double averageMark;

    public Student(String firstName, String lastname, String group, double averageMark) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Integer getScolarship(double averageMark){
       if(averageMark == 5){
           return 100;
       } else {
           return 80;
       }
    }
}
