package ioc.factory;

import ioc.beans.BeanDefinition;
import ioc.config.BeansException;
import ioc.context.processor.BeanPostProcessor;

/**
 * 获取beanDefinition
 * 提起实例化单例Bean
 * 存储BeanPostProcessor
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}