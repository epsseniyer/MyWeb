package cn.zilio.myweb.dao;

import cn.zilio.myweb.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User getUserById(String uid) throws Exception;
}
