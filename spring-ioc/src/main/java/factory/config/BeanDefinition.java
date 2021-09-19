package factory.config;

import factory.support.property.PropertyValues;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Bean的基本信息
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }
}