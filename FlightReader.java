import java.util.Scanner;
import java.io.*;


public class FlightReader {

    /**
      Reads a txt file with flight informations in the format of:
      YEAR MONTH DAY FLIGHTNUMBER DEPARTINGDELAY ARRIVALDELAY ORIGINAIRPORT
      ARRIVALAIRPORT
    **/
    public static Flight[] readFlights(String filename){
        try (Scanner in = new Scanner(new File(filename))) {
            int numofiter = in.nextInt();
            //creating an array of Flight objects with the number of flights read from the file
            Flight[] arrayofflights = new Flight[numofiter];
            //for each from the number of flights
            for (int i = 0; i < numofiter; i++){
                //create a flight
                Flight current = new Flight(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.next(), in.next());
                //loading the newly generated flight object into the right index
                arrayofflights[i] = current;
            }
            return arrayofflights;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            return null;
        }

    }
}
