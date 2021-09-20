package factory;

import beans.BeanDefinition;
import config.BeansException;
import context.processor.BeanPostProcessor;

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