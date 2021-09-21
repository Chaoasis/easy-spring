package beans;

/**
 * 能够创建Bean的Bean容器的顶级接口
 *
 * @param <T>
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();

}