package HomeWork2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        homeTask(args);

    }

    public static void homeTask(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Write a year");
        int year = in.nextInt();
        System.out.println("Write a month");
        int month = in.nextInt();
        int daysInMonth = 0;
        String[] arrayOfMonth =  {
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };
        //String[] arrayOfMonth = new String[1];

        // if the year is leap
        // if(  year % 4 == 0 && year % 400 != 0 ) {leap} else {isn't leap}
        if ( year % 4 == 0 ) {
            if (year % 400 != 0) {
                    //is leap
                switch(month) {
                    case 1:
                        //january
                        daysInMonth = 31;
                        break;
                    case 2:
                        //february
                        daysInMonth = 29;
                        break;
                    case 3:
                        //march
                        daysInMonth = 31;
                        break;
                    case 4:
                        //april
                        daysInMonth = 30;
                        break;
                    case 5:
                        //may
                        daysInMonth = 31;
                        break;
                    case 6:
                        //june
                        daysInMonth = 30;
                        break;
                    case 7:
                        //july
                        daysInMonth = 31;
                        break;
                    case 8:
                        //august
                        daysInMonth = 31;
                        break;
                    case 9:
                        //september
                        daysInMonth = 30;
                        break;
                    case 10:
                        //october
                        daysInMonth = 31;
                        break;
                    case 11:
                        //november
                        daysInMonth = 30;
                        break;
                    case 12:
                        //december
                        daysInMonth = 31;
                        break;
                    }
                }
        } else{
            //isn't leap
            switch(month) {
                case 1:
                    //january
                    daysInMonth = 31;
                    break;
                case 2:
                    //february
                    daysInMonth = 28;
                    break;
                case 3:
                    //march
                    daysInMonth = 31;
                    break;
                case 4:
                    //april
                    daysInMonth = 30;
                    break;
                case 5:
                    //may
                    daysInMonth = 31;
                    break;
                case 6:
                    //june
                    daysInMonth = 30;
                    break;
                case 7:
                    //july
                    daysInMonth = 31;
                    break;
                case 8:
                    //august
                    daysInMonth = 31;
                    break;
                case 9:
                    //september
                    daysInMonth = 30;
                    break;
                case 10:
                    //october
                    daysInMonth = 31;
                    break;
                case 11:
                    //november
                    daysInMonth = 30;
                    break;
                case 12:
                    //december
                    daysInMonth = 31;
                    break;
            }
        }

        System.out.println(year + " " + arrayOfMonth[month-1] + " has " + daysInMonth + " days.");
    }

}
