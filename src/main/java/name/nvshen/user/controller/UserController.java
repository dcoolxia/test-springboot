package name.nvshen.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import name.nvshen.user.bean.User;
import name.nvshen.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @RequestMapping("/add")
    public String addUser() {
        User user = new User();
        userService.addUser(user);
        return "Hello world!";
    }
}