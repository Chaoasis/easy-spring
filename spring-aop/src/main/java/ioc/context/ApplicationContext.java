package ioc.context;

import ioc.context.event.ApplicationEventPublisher;
import ioc.factory.HierarchicalBeanFactory;
import ioc.factory.ListableBeanFactory;
import ioc.io.ResourceLoader;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}