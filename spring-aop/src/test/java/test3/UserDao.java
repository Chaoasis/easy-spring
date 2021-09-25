package test3;

import context.annotation.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "刘备，河北涿县人");
        hashMap.put("10002", "关羽，河东解人");
        hashMap.put("10003", "张飞，河北涿县人");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}