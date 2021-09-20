package support.reader;

import config.BeansException;
import core.io.Resource;
import core.io.ResourceLoader;
import support.registry.BeanDefinitionRegistry;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}