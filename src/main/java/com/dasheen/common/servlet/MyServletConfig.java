package com.dasheen.common.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 *
 * servlet原生组件：servlet，filter，listener
 * 注入到spring容器中
 */
@Configuration(proxyBeanMethods = true)//保证依赖的组件始终是单实例的
public class MyServletConfig {

    @Bean
    public ServletRegistrationBean<MyServlet> myServlet(){
        MyServlet myServlet = new MyServlet();
        return new ServletRegistrationBean<>(myServlet,"/servlet");
    }

    @Bean
    public FilterRegistrationBean<MyFilter> myFilter(ServletRegistrationBean myServlet){
        MyFilter myFilter = new MyFilter();
        //return new FilterRegistrationBean(myFilter, myServlet);
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>(myFilter);
        registrationBean.setUrlPatterns(Arrays.asList("/servlet"));
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean<MyListener> myListener(){
        MyListener myListener = new MyListener();
        return new ServletListenerRegistrationBean<>(myListener);
    }


}
