package bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static final Map<String, String> hashMap = new HashMap<>(4);

    public void initDataMethod() {
        System.out.println("执行：init-method");
        hashMap.put("10001", "刘备");
        hashMap.put("10002", "关羽");
        hashMap.put("10003", "张飞");
    }

    public void destroyDataMethod() {
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}