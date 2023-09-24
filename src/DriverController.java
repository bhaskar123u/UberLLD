import java.util.HashMap;
import java.util.UUID;

public class DriverController {

  private static volatile DriverController obj = null;
  private static HashMap<UUID, Driver> driverMap;

  private DriverController() {}
  
  public static DriverController getInstance() {
    if (obj == null) {
      synchronized (DriverController.class) {
        if (obj == null) // double check locking
          obj = new DriverController();
          driverMap = new HashMap<>();
      }
    }
    return obj;
  }

  private void addDriver() {
    Driver newDriver = new Driver(null, null, null, null, 0, 0);
    UUID newDriverId = UUID.randomUUID();
    driverMap.put(newDriverId, newDriver);
  }

  private Driver getDriver(UUID key) {
    return driverMap.get(key);
  }
}