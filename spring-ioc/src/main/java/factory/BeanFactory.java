package factory;


import factory.config.BeansException;

/**
 * 基础接口功能
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
