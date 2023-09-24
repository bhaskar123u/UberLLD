public class StrategyManager {

  private static volatile StrategyManager obj = null;
  DriverMatchingStrategy driverMatchingStrategy;
  PricingStrategy pricingStrategy;

  StrategyManager() {}
  
  public static StrategyManager getInstance() {
    if (obj == null) {
      synchronized (StrategyManager.class) {
        if (obj == null) // double check locking
          obj = new StrategyManager();
      }
    }
    return obj;
  }

  protected void setPricingStrategy(TripMetaData tripMetaData) {
    // based on some logic
    pricingStrategy = new RatingBasedPricingStrategy();
  }
  
  PricingStrategy getPricingStrategy() {
    return pricingStrategy;
  }
  
  protected void setDriverMatchingStrategy(TripMetaData tripMetaData) {
    // based on some logic
    driverMatchingStrategy = new HighestRatingBasedDriverMatchingStrategy();
  }

  protected DriverMatchingStrategy getDriverMatchingStrategy() {
    return driverMatchingStrategy;
  }
}
