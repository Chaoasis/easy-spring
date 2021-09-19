package factory.config;

/**
 * 单例接口
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}