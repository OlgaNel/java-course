package lesson8_task2;

public class Main {
    public static void main(String[] args) {
        Reader olga = new Reader();
        String[] a = {"123", "qwe"};
        olga.takeBook();
        olga.takeBook(a);
        olga.takeBook(6);
        olga.returnBook(a);
    }
}