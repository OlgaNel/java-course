package HomeWork1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        HomeWork1.task1(args);
        HomeWork1.task2(args);
        HomeWork1.task3(args);
        HomeWork1.task4(args);
        HomeWork1.task5(args);
    }

    public static void task1(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Provide number in inches and press enter.");
        String numInInchString = in.nextLine();

        int numInInch = Integer.parseInt(numInInchString);
        double meter = 0.0254;
        double numInMeter = numInInch * meter;

        System.out.println("Number in meters is " + numInMeter);
    }

    public static void task2(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Provide the number of minutes and press enter.");
        String minutesString = in.nextLine();
        int minutes = Integer.parseInt(minutesString);

        //convert minutes to hours, days and years
        int hour = minutes / 60;
        int days = hour / 24;
        int years = days / 365;

        //check if there are any rest of dividing
        if ((days % 365) != 0) {
            days = days % 365;
        }

        System.out.println("Approximate time is " + years + " year(s)" + " " + days + " days");

    }

    public static void task3(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Provide your weight in pounds and press enter.");
        String weightString = in.nextLine();
        int weightPounds = Integer.parseInt(weightString);
        double weightKilograms = 0.453592 * weightPounds;

        System.out.println("Provide your height in inches and press enter.");
        String heightString = in.nextLine();
        int heightInches = Integer.parseInt(heightString);
        double heightCentimeters = heightInches * 0.0254;

        double BMI = weightKilograms / Math.pow(heightCentimeters, 2);

        System.out.println("The body mass index is " + BMI);

    }

    public static void task4(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Provide distance in meters.");
        String distanceInMetersString = in.nextLine();
        int distanceInMeters = Integer.parseInt(distanceInMetersString);

        System.out.println("Provide the number of hours.");
        String hoursString = in.nextLine();
        int hours = Integer.parseInt(hoursString);

        System.out.println("Provide the number of minutes.");
        String minsString = in.nextLine();
        int mins = Integer.parseInt(minsString);

        System.out.println("Provide the number of seconds.");
        String secondsString = in.nextLine();
        int seconds = Integer.parseInt(secondsString);

        //convert mins and hours to seconds
        int minsInSeconds = mins * 60;
        float hoursToSeconds = hours * 60 * 60;

        //convert distance from km to meters, convert mins and seconds to hours
        float distanceInKilometers = distanceInMeters / 1000f; //2.5
        float minsToHour = mins / 60f; //0.93333
        float secondsToMins = seconds / 60f;
        float secondsToHour = secondsToMins/60;//0.38333

        //calculate metersPerSecond and kilometersPerHour
        float metersPerSecond = distanceInMeters / (hoursToSeconds + minsInSeconds + seconds);
        float kilometersPerHour = distanceInKilometers / (hours + minsToHour + secondsToHour);

        System.out.println("Your speed in meters/second is " + metersPerSecond);
        System.out.println("Your speed in km/h is " + kilometersPerHour);

    }

    public static void task5(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Provide min value.");
        String minValueString = in.nextLine();
        int minValue = Integer.parseInt(minValueString);

        System.out.println("Provide max value.");
        String maxValueString = in.nextLine();
        int maxValue = Integer.parseInt(maxValueString);
        //check if min greater than max
        if ( minValue > maxValue) {
            System.out.println("Min value should be greater than max value.");
        }

        double randomValueDouble = ((Math.random() * (maxValue - minValue)) + minValue);
        int randomValueInt = (int)randomValueDouble;
        System.out.println("Your random number is " + randomValueInt);
    }
}