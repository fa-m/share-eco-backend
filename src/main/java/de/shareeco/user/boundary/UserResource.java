package de.shareeco.user.boundary;

import de.shareeco.user.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserResource {

    private final UserRepository userRepository = new UserRepository();

    @GetMapping("/user")
    @ResponseBody
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    @PostMapping("/user")
    @ResponseBody
    public User postUser() {
        return null;
    }

    @PutMapping("/user/{id}")
    @ResponseBody
    public User putUser(@PathVariable("id") long id) {
        return new User("Dolf", "nimeand", "X");
    }

    @DeleteMapping("/user/{id}")
    @ResponseBody
    public User deleteUser(@PathVariable("id") long id) {
        return new User("Dolf", "nimeand", "X");
    }

}
