public class SpeedConverter2 {


    public static void main(String[] args) {


        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
       


    }


    public static long toMilesPerHour(double kilometersPerMile) {

        if (kilometersPerMile >= 0) {

            return Math.round(kilometersPerMile / 1.609);

        } else return -1;

    }

    public static void printConversion(double kilometerPerHour) {



        if (kilometerPerHour >= 0) {

            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + "km/h =" + milesPerHour + "mi/h");


        } else

            System.out.println("Invalid value");


    }


}
