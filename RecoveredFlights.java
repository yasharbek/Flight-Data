public class RecoveredFlights{
    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Please specify a single airport code");
        }
      
        else {
            //hard-code the file name
            String direct = "phl-flights.txt";

            //create array of flights and load it in
            Flight[] ourflights = FlightReader.readFlights(direct);

            //initialize flightstotal, or # of delayed flights, and flightsrecov, recovered flights
            float flightstotal = 0;
            float flightsrecov = 0;

            for (int i=0; i < ourflights.length; i++){
                //if a certain flight starts at the specified airport
                if (ourflights[i].getOriginAirport().equals(args[0])){
                  //check if delayed
                  float delayed = (float) ourflights[i].getDepartDelay();
                  //if delayed - keep track - add to flightstotal
                  if (delayed > 0) {
                    flightstotal++;
                    float arrived = (float) ourflights[i].getArrivalDelay();
                    //if delayed AND recovered - also keep track - add to flightsrecov
                    if (arrived < 1){
                      flightsrecov++;
                    }
                  }
                }
            }
            
            if (flightstotal == 0){
              System.out.printf("There were no delayed flights from %s\n", args[0]);
            }
            else{
              float ratio = (flightsrecov/flightstotal)*100;
              System.out.printf("%.2f", ratio);
              System.out.println("% of delayed flights from " + args[0] +" recovered");
            }

        }

    }
}
