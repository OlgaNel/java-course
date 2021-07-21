package lesson8;

public class Person {
    private String fullName;
    private String age;


   public void move(String fullName){
       System.out.println(fullName + " is moving");
       //return fullName;
   };
    public void talk(String fullName){
        System.out.println(fullName + " is talking");
        //return fullName;
    }

    public Person() {
    }

    public Person(String fullName, String age) {
        this.fullName = fullName;
        this.age = age;
    }
}
