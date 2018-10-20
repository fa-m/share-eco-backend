package de.shareeco.user.boundary;

import de.shareeco.user.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
        users.add(new User("Farakh", "Cheffe", "FirmaX"));
        users.add(new User("Onur", "anderer Cheffe", "FirmaY"));
        users.add(new User("Peter", "Noob", "FirmaY"));
        users.add(new User("Hannes", "auch noob", "FirmaY"));
        users.add(new User("Gertrud", "CEO", "FirmaY"));

    }

    public void addUsr(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
