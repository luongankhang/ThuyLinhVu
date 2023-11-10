package entities;

import java.util.List;

public interface UserDataSource {
    List<User> getAllUsers();

    User getUserByUsername(String username);
}
