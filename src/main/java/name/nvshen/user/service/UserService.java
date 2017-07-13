package name.nvshen.user.service;

import name.nvshen.common.vo.ResultVO;
import name.nvshen.user.bean.User;

public interface UserService {

    ResultVO addUser(User user);
}
