package context.event.impl;

import context.event.ApplicationEvent;
import context.event.ApplicationListener;
import factory.BeanFactory;

/**
 * 设置beanFactory
 * 1.首先把所有的监听器加入到ioc容器中
 * 2.当调用multicastEvent方法时,通过判断容器中的监听器的泛型类型和传入的泛型类型是否一致,返回一致的Listener集合
 * 3.调用对应的通知方法
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }

}