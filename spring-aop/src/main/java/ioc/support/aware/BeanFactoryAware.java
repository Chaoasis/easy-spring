package ioc.support.aware;

import ioc.config.BeansException;
import ioc.factory.BeanFactory;

public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}