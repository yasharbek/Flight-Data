public class FlightCounter{
    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Please specify a date");
        }
        else{
            String direct = "phl-flights.txt";
            Flight[] ourflights = FlightReader.readFlights(direct);
            int accum = 0;
            for (int i = 0; i < ourflights.length; i++){
                if (ourflights[i].getDate().equals(args[0])){
                    accum++;
                }
            }
            System.out.printf("Number of flights on %s: %d\n", args[0], accum);
        }
    }
}