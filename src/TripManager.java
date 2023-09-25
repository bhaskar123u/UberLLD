import java.util.HashMap;
import java.util.UUID;

public class TripManager {

  private static volatile TripManager obj = null;
  private static DriverController driverController;
  private static UserController userController;
  private StrategyManager strategyManager;
  private static HashMap<UUID, TripMetaData> tripMetaDataMap;
  private static HashMap<UUID, Trip> tripMap;
  private TripMetaData tripMetaData;

  private TripManager() {}
  
  public static TripManager getInstance() {
    if (obj == null) {
      synchronized (TripManager.class) {
        if (obj == null) // double check locking
          obj = new TripManager();
          tripMap = new HashMap<>();
          tripMetaDataMap = new HashMap<>();
          userController = UserController.getInstance();
          driverController = DriverController.getInstance();
      }
    }
    return obj;
  }
  
  protected UUID createTrip(User user, Location source, Location destination) {
    tripMetaData = new TripMetaData(UUID.randomUUID(), source, destination, user);
    strategyManager = StrategyManager.getInstance();
    strategyManager.setDriverMatchingStrategy(tripMetaData);
    strategyManager.setPricingStrategy(tripMetaData);

    // Multiple driver accepted
    Driver driver = strategyManager.getDriverMatchingStrategy().bestDriver(tripMetaData);
    int price = strategyManager.getPricingStrategy().bestPrice(tripMetaData);

    Trip newTrip = new Trip(UUID.randomUUID(), user, driver, source, destination, price, TripStatus.INITIATED);
    UUID newTripId = newTrip.getTripID();
    tripMetaDataMap.put(newTripId, tripMetaData);
    tripMap.put(newTripId, newTrip);

    return newTripId;
  }

  protected void setTripMetaData(TripMetaData tripMetaData) {
    this.tripMetaData = tripMetaData;
  }

  protected ConfirmedTripDetail getConfirmedTripDetail(UUID key) {
    Trip trip = tripMap.get(key);
    ConfirmedTripDetail upComingTrip = new ConfirmedTripDetail(trip.getDriver(), trip.getOTP(),
        TripUtils.getETA(trip.getSourceLocation(), trip.getDriver().getCurrentLocation()));

    return upComingTrip;
  }
  
  protected HashMap<UUID, Trip> getTripMap() {
    return tripMap;
  }
}
