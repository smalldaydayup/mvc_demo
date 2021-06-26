package com.example.mvc_demo.book;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


@Component
public class MyFirstBeanPostProcessor implements BeanPostProcessor {

    public MyFirstBeanPostProcessor() {
        System.out.println("自定义的 BeanPostProcessor 注册到 spring 啦");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        final Object obj = bean;
        //如果当前经过BeanPostProcessors的Bean是Calculator类型，我们就返回它的代理对象
        if (bean instanceof Lord) {
            Object proxyObj = Proxy.newProxyInstance(
                    this.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            System.out.println("AOP BEGIN");
                            Object result = method.invoke(obj, args);
                            System.out.println("AOP END");
                            return result;
                        }
                    }
            );
            return proxyObj;
        }
        //否则返回本身
        return obj;
    }
}
