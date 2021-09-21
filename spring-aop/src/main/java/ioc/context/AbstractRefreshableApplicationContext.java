package ioc.context;

import ioc.config.BeansException;
import ioc.factory.ConfigurableListableBeanFactory;
import ioc.factory.impl.DefaultListableBeanFactory;

/**
 * AbstractApplicationContext的子类,实现相关部分功能
 * 创建Factory以及加载相关的BeanDefinition信息的行为
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }

}