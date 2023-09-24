import java.util.Random;
import java.util.UUID;

public class Trip {

  private UUID tripID;
  private User user;
  // Don't need driver in constructor, as it will be assigned later
  private Driver driver;
  private Location sourceLocation;
  private Location destinationLocation;
  // Don't need fare in constructor, as it will be assigned later
  private int fare;
  private TripStatus tripStatus;
  private String OTP;

  public Trip(UUID tripID, User user, Driver driver, Location sourceLocation, Location destinationLocation, int fare,
      TripStatus tripStatus) {
    this.tripID = tripID;
    this.user = user;
    this.driver = driver;
    this.sourceLocation = sourceLocation;
    this.destinationLocation = destinationLocation;
    this.fare = fare;
    this.tripStatus = tripStatus;
  }

  public UUID getTripID() {
    return tripID;
  }

  public void setTripID(UUID tripID) {
    this.tripID = tripID;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public Location getSourceLocation() {
    return sourceLocation;
  }

  public void setSourceLocation(Location sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  public Location getDestinationLocation() {
    return destinationLocation;
  }

  public void setDestinationLocation(Location destinationLocation) {
    this.destinationLocation = destinationLocation;
  }

  public int getFare() {
    return fare;
  }

  public void setFare(int fare) {
    this.fare = fare;
  }

  public TripStatus getTripStatus() {
    return tripStatus;
  }

  public void setTripStatus(TripStatus tripStatus) {
    this.tripStatus = tripStatus;
  }

  public String getOTP() {
    return OTP;
  }

  public void setOTP(String oTP) {
    // some logic to calculate OTP
    OTP = "1214";
  }
}
