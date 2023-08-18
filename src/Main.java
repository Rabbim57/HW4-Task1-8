import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершенолетний");
        } else {
            System.out.println("Если возраст человека равен" + age + ", то не совершенолетний");
        }

        int airTemperature = 10;
        if (airTemperature <= 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + ", можно идти без шапки");

        }

        int speed = 60;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        int agePeople = 15;
        boolean canToKindergarten = (agePeople > 2 && agePeople < 6);
        boolean canToSchool = (agePeople > 7 && agePeople < 18);
        boolean canToUniversity = (agePeople > 18 && agePeople < 24);
        boolean canToWork = (agePeople > 24);


        if (canToKindergarten) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в сад");
        }
        if (canToSchool) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в школу");
        }
        if (canToUniversity) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в университет");
        }
        if (canToWork) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить на работу");
        }

        int ageChildren = 20;
        boolean rideAnAttraction = (ageChildren < 5);
        boolean accompanyingAnAdult = (ageChildren < 5 && ageChildren > 14);
        boolean unaccompaniedAnAdult = (ageChildren > 14);

        if (rideAnAttraction) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то ему нельзя кататься на аттракционе");
        }
        if (accompanyingAnAdult) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то можно кататься на аттракционе в сопровождении");
        }
        if (unaccompaniedAnAdult) {
            System.out.println("Если возраст ребенка равен " + ageChildren + ", то можно кататься на аттракционе без сопровождения взролого");
        }

        int trainCapacity = 102;
        int seatsInSeats = 60;
        int standingPlaces = (trainCapacity - seatsInSeats);
        int seatsInSeatsBusy = 60 ;
        int standingPlacesBusy = 42;
        int remainingPlaces = (seatsInSeatsBusy + standingPlacesBusy);

        if (seatsInSeatsBusy < 60) {
            System.out.println( "Есть сидячие места в количестве " + (seatsInSeats - seatsInSeatsBusy));
        }
        if (standingPlacesBusy <42) {
            System.out.println("Есть стоячие места в количсетве " + (standingPlaces - standingPlacesBusy));
        }
        if (remainingPlaces == 102) {
            System.out.println("Нет мест в вагоне");
        }

        
    }



}
