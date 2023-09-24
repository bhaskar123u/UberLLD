import java.util.List;

public class User extends Person {

  private PaymentMethod defaultPaymentMethod;
  private int totalTrips;
  private double averageRating;
  private List<Trip> trips;

  public User(String name, String permanentAddress, String contact, String email, PaymentMethod defaultPaymentMethod,
      int totalTrips, double averageRating, List<Trip> trips) {
    super(name, permanentAddress, contact, email);
    this.defaultPaymentMethod = defaultPaymentMethod;
    this.totalTrips = totalTrips;
    this.averageRating = averageRating;
    this.trips = trips;
  }

  public PaymentMethod getDefaultPaymentMethod() {
    return defaultPaymentMethod;
  }

  public void setDefaultPaymentMethod(PaymentMethod defaultPaymentMethod) {
    this.defaultPaymentMethod = defaultPaymentMethod;
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

  public List<Trip> getTrips() {
    return trips;
  }

  public void setTrips(List<Trip> trips) {
    this.trips = trips;
  }
}
