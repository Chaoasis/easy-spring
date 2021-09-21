package ioc.context.processor;

import ioc.config.BeansException;
import ioc.factory.ConfigurableListableBeanFactory;

/**
 * Bean处理器,提前实例化相关的Bean,并会在合适的时机调用相关的方法
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}