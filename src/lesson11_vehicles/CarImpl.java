package lesson11_vehicles;

import lesson11_details.Diesel;
import lesson11_professions.Driver;
import lesson11_professions.NewDriver;

public class CarImpl implements Car{

    NewDriver newDriver = new NewDriver();
    Diesel newDiesel = new Diesel();


    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void turnRight() {
        System.out.println("turnRight");
    }

    @Override
    public void turnLeft() {
        System.out.println("turnLeft");
    }

    @Override
    public void toStringCustom() {
        System.out.println();
    }
}
