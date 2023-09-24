public class Driver extends Person {
  
  private int totalTrips;
  private double averageRating;
  private Location currentLocation;

  public Driver(String name, String permanentAddress, String contact, String email, int totalTrips,
      double averageRating) {
    super(name, permanentAddress, contact, email);
    this.totalTrips = totalTrips;
    this.averageRating = averageRating;
  }

  public int getTotalTrips() {
    return totalTrips;
  }

  public void setTotalTrips(int totalTrips) {
    this.totalTrips = totalTrips;
  }

  public double getAverageRating() {
    return averageRating;
  }

  public void setAverageRating(double averageRating) {
    this.averageRating = averageRating;
  }

  public Location getCurrentLocation() {
    return currentLocation;
  }

  public void setCurrentLocation(Location currentLocation) {
    // Some implementation which will constantly update the current location of driver
    this.currentLocation = currentLocation;
  }

  
}
