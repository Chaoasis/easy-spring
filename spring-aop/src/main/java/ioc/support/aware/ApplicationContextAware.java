package ioc.support.aware;

import ioc.config.BeansException;
import ioc.context.ApplicationContext;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}