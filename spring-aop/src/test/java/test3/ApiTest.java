package test3;

import context.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring2.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println(":----");
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}