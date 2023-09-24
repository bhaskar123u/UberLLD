import java.util.HashMap;
import java.util.UUID;

public class UserController {

  private static volatile UserController obj = null;
  private static HashMap<UUID, User> userMap;

  private UserController() {}
  
  public static UserController getInstance() {
    if (obj == null) {
      synchronized (UserController.class) {
        if (obj == null) // double check locking
          obj = new UserController();
          userMap = new HashMap<>();
      }
    }
    return obj;
  }

  private void addUser() {
    User newUser = new User(null, null, null, null, null, 0, 0, null);
    UUID newUserId = UUID.randomUUID();
    userMap.put(newUserId, newUser);
  }

  private User getUser(UUID key) {
    return userMap.get(key);
  }
}