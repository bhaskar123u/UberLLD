public class ConfirmedTripDetail {
  
  private Driver driver;
  private String OTP;
  private int tripStartETA;

  public ConfirmedTripDetail(Driver driver, String oTP, int tripStartETA) {
    this.driver = driver;
    OTP = oTP;
    this.tripStartETA = tripStartETA;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public String getOTP() {
    return OTP;
  }

  public void setOTP(String oTP) {
    OTP = oTP;
  }

  public int getTripStartETA() {
    return 0;
  }

  public void setTripStartETA(int tripStartETA) {
    this.tripStartETA = tripStartETA;
  }
}
