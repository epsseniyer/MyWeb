package cn.zilio.myweb.dao;

import cn.zilio.myweb.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findUserByUid(String uid) throws Exception;

    User findUserByEmail(String email) throws Exception;

    User saveAndFlush(User user);
}
