package lesson11_vehicles;

import lesson11_details.Diesel;
import lesson11_professions.NewDriver;

public interface Car {
    String brand = "BMW";
    String classCar = "S";
    Integer weight = 5000;


    void start();

    void stop();

    void turnRight();

    void turnLeft();

    void toStringCustom();

}
