package name.nvshen.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import name.nvshen.common.vo.ResultVO;
import name.nvshen.user.bean.User;
import name.nvshen.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public ResultVO addUser() {
        User user = new User();
        user.setName("zhangsan");
        user.setLevel(1);
        ResultVO vo = userService.addUser(user);
        return vo;
    }
}