package name.nvshen.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.nvshen.common.vo.ResultVO;
import name.nvshen.user.bean.User;
import name.nvshen.user.dao.UserMapper;
import name.nvshen.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    
    @Override
    public ResultVO addUser(User user) {
        ResultVO vo;
        int i = userMapper.insertUser(user);
        if (i==1) {
            vo = ResultVO.success();
        } else {
            vo = ResultVO.fail();
        }
        
        return vo;
    }

}
