public class Flight {
    
    private int day;
    private int month;
    private int year;
    private int flightnum;
    private int departdelay;
    private int arrivaldelay;
    private String originairport;
    private String destinairport;

    public Flight(int year, int month, int day, int flightnum, int departdelay, int arrivaldelay, String originairport, String destinairport){
        this.day = day;
        this.year = year;
        this.month = month;
        this.year = year;
        this.flightnum = flightnum;
        this.departdelay = departdelay;
        this.arrivaldelay = arrivaldelay; 
        this.originairport = originairport;
        this.destinairport = destinairport;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

 public int getYear(){
        return year;
    }

    public int getFlightNum(){
        return flightnum;
    }

    public int getDepartDelay(){
        return departdelay;
    }

    public int getArrivalDelay(){
        return arrivaldelay;
    }

    public String getOriginAirport(){
        return originairport;
    }

    public String getDestinAirport(){
        return destinairport;
    }

    public String getDate(){
        String fulldate = month + "/" + day + "/" + year;
        return fulldate;
    }

    public String toString(){
        String details = "Flight " + flightnum + " on " + getDate();
        String contdetails = details + " had a delay of " + departdelay + " leaving " + originairport + " and a delay of ";
        String finaldetails = contdetails + arrivaldelay + " arriving at " + destinairport + ".";
        return finaldetails;
    }
}