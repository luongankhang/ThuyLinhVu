package entities;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDataSource implements UserDataSource {
    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
