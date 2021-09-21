package ioc.support.reader;

import ioc.config.BeansException;
import ioc.io.Resource;
import ioc.io.ResourceLoader;
import ioc.support.registry.BeanDefinitionRegistry;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}