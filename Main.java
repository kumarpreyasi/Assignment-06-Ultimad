import java.util.Scanner;

public class Main {

    public static int worldTime;

    public static void main(String args[]){

        //1 year = 365 days = 365*1440 minutes = 525600 minutes (24 hours in 1 day, 60 minutes in 1 hour)
        //Time in 24-hr clock (0:00, 15:10, 06:19, etc)
        //First year = 1, first day of the year = 1
        //Moons Trammel = 9 day cycle (9*1440 minutes = 12960 minutes), Felucca = 14 day cycle (14*1440 minutes = 20160 minutes)

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the World Time? ");
        worldTime = sc.nextInt();

        System.out.printf("It is %d:%d on day %d of the year %d.", calcHours(worldTime), calcMinutes(worldTime), calcDays(worldTime), calcYear(worldTime));
        System.out.printf("\nTrammel is in day %d of its 9 day phase.", calcTrammel(worldTime));
        System.out.printf("\nFelucca is in day %d of its 14 day phase.", calcFelucca(worldTime));

    }

    public static int calcYear(int year) {
        year = worldTime/525600 + 1;
        return year;
    }

    public static int calcDays(int days) {
        days = ((worldTime%525600)/1440) + 1;
        return days;
    }

    public static int calcHours(int hours) {
        hours = worldTime%525600%1440/60;
        return hours;

    }

    public static int calcMinutes(int minutes) {
        minutes = worldTime%525600%1440%60;
        return minutes;
    }

    public static int calcTrammel(int Trammel) {
        Trammel = ((worldTime/1440)%9) + 1;
        return Trammel;
    }

    public static int calcFelucca(int Felucca) {
        Felucca = ((worldTime/1440)%14) + 1;
        return Felucca;
    }

}

//  FORMAT OF RESULTS:

//  worldTime = ___
//  It is __:__ on day __ of the year ___.
//  Trammel is in day __ of its 9 day phase.
//  Felucca is in day __ of its 14 day phase.

//  worldTime 168260271
//  Year 321
//  Day 48
//  Time 9:51
//  Trammel day 1
//  Felucca day 4

//  worldTime 27364375
//  Year 53
//  Day 24
//  Time 0:55
//  Trammel day 5
//  Felucca day 6

//  worldTime 67294091
//  Year 129
//  Day 13
//  Time 0:11
//  Trammel day 5
//  Felucca day 1










