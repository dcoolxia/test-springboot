package name.nvshen.user.dao;

import name.nvshen.user.bean.User;

/**
 * 建表语句
 * CREATE TABLE `t_user` (
   `id` int(11) NOT NULL auto_increment,
   `name` varchar(10) default NULL,
   `level` int(11) default NULL,
   PRIMARY KEY  (`id`)
   ) ENGINE=InnoDB DEFAULT CHARSET=utf8
 */
public interface UserMapper {

    int insertUser(User user);
}
