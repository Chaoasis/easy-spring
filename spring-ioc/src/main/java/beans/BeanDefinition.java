package beans;

import beans.property.PropertyValues;
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

    private String initMethodName;

    private String destroyMethodName;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }
}