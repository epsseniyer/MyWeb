package cn.zilio.myweb.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassUtils {
    public static void clzCopy(Object src, Object des) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = src.getClass().getMethods();
        for(Method s : src.getClass().getMethods()) {
            if(s.getName().startsWith("get")) {
                s.setAccessible(true);
                if(s.getReturnType() == Integer.class) {
                    Integer value = (Integer)s.invoke(src);
                    if(value == 0) {
                        continue;
                    }
                } else if(s.getReturnType() == Float.class) {
                    Float value = (Float) s.invoke(src);
                    if(value == 0.0) {
                        continue;
                    }
                } else if(s.getReturnType() == Double.class) {
                    Double value = (Double) s.invoke(src);
                    if(value == 0.0) {
                        continue;
                    }
                } else {
                    Object value = s.invoke(src);
                    if(value == null) {
                        continue;
                    }
                }

                for(Method d : des.getClass().getMethods()) {
                    if(d.getName().startsWith("set") && d.getName().substring(3).equals(s.getName().substring(3))) {
                        d.setAccessible(true);
                        d.invoke(des, s.invoke(src));
                    }
                }
            }
        }
    }
}
