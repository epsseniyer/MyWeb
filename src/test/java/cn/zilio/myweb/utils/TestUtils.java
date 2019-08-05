package cn.zilio.myweb.utils;


import cn.zilio.myweb.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class TestUtils extends TestCase {
    @Test
    public void testClassCopy() {
        User src = new User();
        User des = new User();
        src.setUserType(UserType.CUSTOMER);
        src.setAge(23);
        src.setUserCoin(500);
        src.setUserBalance(100.00);
        src.setEmail("test@learning.com");
        src.setName("testUser");
        src.setUsername("testcase");

        des.setUsername("testUser2");
        des.setEmail("object@126.com");
        des.setUserCoin(5500);

        try {
            ClassUtils.clzCopy(src.getClass(), des.getClass());
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertEquals(des.getAge(),(Integer)23);
        assertEquals(des.getEmail(), "object@126.com");
        assertEquals(des.getName(), "testUser");
        assertEquals(des.getUserBalance(), (Double) 100.00);
        assertEquals(des.getUserCoin(), (Integer) 5500);
    }
}
