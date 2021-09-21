package ioc.support.instant;

import ioc.beans.BeanDefinition;
import ioc.config.BeansException;

import java.lang.reflect.Constructor;

/**
 * 实例策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}