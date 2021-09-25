package factory;

import config.BeansException;

public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}