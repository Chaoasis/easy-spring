package factory.config;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Bean的基本信息
 */
@Data
@AllArgsConstructor
public class BeanDefinition {

    private Class beanClass;

}