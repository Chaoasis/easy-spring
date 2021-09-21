package context;

import context.event.ApplicationEventPublisher;
import core.io.ResourceLoader;
import factory.HierarchicalBeanFactory;
import factory.ListableBeanFactory;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}