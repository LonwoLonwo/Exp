import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.Date;

public class Loader {
    public static void main(String[] args) {

        Date dateNow = new Date();

        Airport airport = Airport.getInstance();

        System.out.println(airport.getAllAircrafts().size());
        System.out.println(airport.getTerminals());


        Aircraft aircraft = new Aircraft("Boeing 737-200");
        System.out.println(aircraft.getModel());
        System.out.println(aircraft.toString());


        Flight flight = new Flight("KL 445", Flight.Type.ARRIVAL, dateNow, aircraft);
        System.out.println(flight.getAircraft());
        System.out.println(flight.getCode());
        System.out.println(flight.getDate());
        System.out.println(flight.getType());
        System.out.println(flight.toString());
    }
}
