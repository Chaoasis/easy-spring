package aop.framework.adapter;

import aop.advice.MethodBeforeAdvice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 和之前的invoke一样
 * 只是之前我们手动生成的方法拦截器塞到support中
 * 现在自动生成了,现在只需要写相关的执行代码就行了
 */
@AllArgsConstructor
@NoArgsConstructor
public class MethodBeforeAdviceInterceptor implements MethodInterceptor {

    private MethodBeforeAdvice advice;
    /**
     * 在执行之前做自己的操作
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        this.advice.before(methodInvocation.getMethod(), methodInvocation.getArguments(), methodInvocation.getThis());
        return methodInvocation.proceed();
    }

}