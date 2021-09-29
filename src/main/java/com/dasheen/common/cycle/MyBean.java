package com.dasheen.common.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 @Description
 @see MyBean
 @author yangminglin
 @date 2020/9/29
 @version V
**/
public class MyBean implements EnvironmentAware, BeanPostProcessor, InitializingBean, DisposableBean {

    private String one;
    private String two;

    public MyBean() {
        System.out.println("1执行无参构造器MyBean()");
    }

    public MyBean(String one, String two) {
        System.out.println("1.1执行全参构造器MyBean(String one, String two)");
        this.one = one;
        this.two = two;
    }

    public String getOne() {
        return one;
    }

    public MyBean setOne(String one) {
        System.out.println("1.2执行set方法->setOne(String one)");
        this.one = one;
        return this;
    }

    public String getTwo() {
        return two;
    }

    public MyBean setTwo(String two) {
        System.out.println("1.2执行set方法->setTwo(String two)");
        this.two = two;
        return this;
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("2执行XXXXXAware接口的set方法->setEnvironment(Environment environment)");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("3执行@PostConstruct注解的方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("4执行InitializingBean#afterPropertiesSet方法");
    }

    private void initMethod() {
        System.out.println("5执行initMethod方法");
    }

     //每一个bean都要执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("6执行后置处理器初始化前->postProcessBeforeInitialization:" + beanName);
        return bean;
    }

     //每一个bean都要执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("7执行后置处理器初始化后->postProcessBeforeInitialization:" + beanName);
        return bean;
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("8执行@PreDestroy注解的方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9执行DisposableBean#destroy方法");
    }

    private void destroyMethod() {
        System.out.println("10执行destroyMethod方法");
    }


}
