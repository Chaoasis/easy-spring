package support.single;

/**
 * 单例接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}