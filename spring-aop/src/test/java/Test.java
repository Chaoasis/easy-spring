import bean.Student;
import net.sf.cglib.proxy.*;


import java.lang.reflect.Method;

public class Test {
    @org.junit.jupiter.api.Test
    public void test_cglib2_(){
        //创建一个Enhancer对象
        Enhancer enchanter = new Enhancer();
        //设置被代理的类
        enchanter.setSuperclass(Student.class);
        //创建一个回调接口
        Callback interceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
                    throws Throwable {
                System.err.println("原方法名是 ： " + method.getName());
                System.err.println("原方法声明的类为 " + method.getDeclaringClass());
                System.err.println("我是 " + (String) proxy.invokeSuper(obj, args));
                System.err.println("我调用结束了");
                return proxy.invokeSuper(obj, args);
            }
        };
        CallbackFilter callbackFilter = new CallbackFilter() {
            @Override
            public int accept(Method method) {
                int flag = 0;
                if ("getStuName".equals(method.getName())) {
                    System.err.println("我将此方法过滤掉了，不对该方法进行拦截");
                    return 1;
                }
                return 0;
            }
        };
        //设置默认不拦截
        Callback[] callbacks = new Callback[] { interceptor, NoOp.INSTANCE };
        enchanter.setCallbackFilter(callbackFilter);
        enchanter.setCallbacks(callbacks);
        Student student = (Student) enchanter.create();
        System.err.println(student.getStuName());
        System.out.println("---------------");
        System.err.println(student.getRename());
    }
}
