package lesson11;

public class Rectangle implements Shape {

    String coordinates;
    public Rectangle(String coordinates) {this.coordinates = coordinates;}
    public void setCoordinates(String coordinates){this.coordinates = coordinates;}


    public void draw(){
        System.out.println(coordinates);
    }



}
