package com.example.mvc_demo.book;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangkun.d
 */
public class TestPostProcessor {
    public static void main(String[] args) {
        System.out.println("容器启动成功！");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        //打印当前容器所有BeanDefinition
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

//        System.out.println("============");
//        School school = (School) applicationContext.getBean("school1");
//        System.out.println("school name :" + school.getSchoolName());
        //取出Calculator类型的实例，调用add方法
        Lord human = (Lord) applicationContext.getBean(Lord.class);
        human.loud();
        System.out.println(human.getClass().getName());

//        HumanImpl humanImpl = (HumanImpl) applicationContext.getBean("humanImpl");
//        System.out.println("humanImpl name:" + humanImpl.getName());
    }
}
