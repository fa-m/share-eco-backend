package de.shareeco.user.boundary;

import de.shareeco.user.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserResource {

    private final UserRepository userRepository = new UserRepository();

    @GetMapping("/user")
    @ResponseBody
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

}
