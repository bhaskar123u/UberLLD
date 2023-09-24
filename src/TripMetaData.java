import java.util.UUID;

public class TripMetaData {
  
  private UUID tripMetaDataId;
  private Location sourceLocation;
  private Location destinationLocation;
  private User user;
  private Driver driver;

  public TripMetaData(UUID tripMetaDataId, Location sourceLocation, Location destinationLocation, User user) {
    this.tripMetaDataId = tripMetaDataId;
    this.sourceLocation = sourceLocation;
    this.destinationLocation = destinationLocation;
    this.user = user;
  }

  public UUID getTripMetaDataId() {
    return tripMetaDataId;
  }

  public Location getSourceLocation() {
    return sourceLocation;
  }

  public Location getDestinationLocation() {
    return destinationLocation;
  }

  public User getUser() {
    return user;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  
}
