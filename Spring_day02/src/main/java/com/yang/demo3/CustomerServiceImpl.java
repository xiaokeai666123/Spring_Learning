package com.yang.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CustomerServiceImpl implements CustomerService, BeanNameAware, ApplicationContextAware, InitializingBean,
    DisposableBean {

    private String name;

    public void setName(String name) {
        System.out.println("第二步： 属性的注入...");
        this.name = name;
    }

    public CustomerServiceImpl() {
        System.out.println("第一步： 实例化类...");
    }

    public void add() {
        System.out.println("添加客户...");
    }

    public void find() {
        System.out.println("查询客户...");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("第三步： 注入配置类的名称: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步： 注入 applicationContext: " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步： 属性设置后执行...");
    }

    public void setup() {
        System.out.println("第七步： 调用手动设置的初始化方法...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步： 调用销毁的方法...");
    }

    public void teardown() {
        System.out.println("第十一步： 调用手动销毁的方法...");
    }

}
