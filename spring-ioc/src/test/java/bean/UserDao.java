package bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static final Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "刘备");
        hashMap.put("10002", "关羽");
        hashMap.put("10003", "张飞");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}