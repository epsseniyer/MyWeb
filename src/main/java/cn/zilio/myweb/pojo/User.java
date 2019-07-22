package cn.zilio.myweb.pojo;

import javax.persistence.*;
import cn.zilio.myweb.utils.UserType;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;


@Entity
@Table(name = "user")
@GenericGenerator(name="jpa-uuid", strategy = "uuid")
public class User {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "uid", unique = true,length = 40)
    String uid;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "username", nullable = false)
    String username;

    @Column(name = "age", nullable = true)
    Integer age;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "phone_number", nullable = false)
    String phoneNumber;

    @Column(name = "user_type", nullable = false)
    UserType userType;

    @Column(name = "user_regist_date", nullable = false)
    Date registDate;

    @Column(name = "user_balance", nullable = false)
    Integer userBalance;

    @Column(name = "user_coin", nullable = false)
    Integer userCoin;

    @Column(name = "user_last_login", nullable = false)
    Date userLastLogin;

    public Date getUserLastLogin() {
        return userLastLogin;
    }

    public void setUserLastLogin(Date userLastLogin) {
        this.userLastLogin = userLastLogin;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public Integer getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Integer userBalance) {
        this.userBalance = userBalance;
    }

    public Integer getUserCoin() {
        return userCoin;
    }

    public void setUserCoin(Integer userCoin) {
        this.userCoin = userCoin;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
