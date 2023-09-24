import java.util.ArrayList;
import java.util.UUID;

public class App {
    public static void main(String[] args) throws Exception {
        // Create users
        User user1 = new User("Bhaskar Sharan", "Patna", "XXXXXXXX33", "bhaskar123u@gmail.com", PaymentMethod.UPI, 0, 0,
                new ArrayList<Trip>());

        // Request for cab
        TripManager tripManager = TripManager.getInstance();
        UUID newTripId = tripManager.createTrip(user1, new Location("GolaRoad", 801503),
                new Location("Kankarbagh", 800020));
        
        //

        // Get confirmed trip details at every 5 seconds
        while (tripManager.getTripMap().get(newTripId).getTripStatus() != TripStatus.STARTED) {
            ConfirmedTripDetail upComingTrip = tripManager.getConfirmedTripDetail(newTripId);
            if (upComingTrip.getTripStartETA() == 0) {
                // Cab reached location, start the trip
                tripManager.getTripMap().get(newTripId).setTripStatus(TripStatus.STARTED);
            }
        }

        // Trip completion
        tripManager.getTripMap().get(newTripId).setTripStatus(TripStatus.COMPLETED);

        // Payment done
        tripManager.getTripMap().get(newTripId).setTripStatus(TripStatus.ENDED);
        System.out.println("Ride Completed");
    }
}
