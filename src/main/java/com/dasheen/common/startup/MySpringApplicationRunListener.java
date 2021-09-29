package com.dasheen.common.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MySpringApplicationRunListener implements SpringApplicationRunListener {

    public MySpringApplicationRunListener(SpringApplication application, String[] args) {

    }

    @Override
    public void starting() {
        System.out.println("springboot:MySpringApplicationRunListener#starting()");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("springboot:MySpringApplicationRunListener#environmentPrepared()");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("springboot:MySpringApplicationRunListener#contextPrepared()");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("springboot:MySpringApplicationRunListener#contextLoaded()");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("springboot:MySpringApplicationRunListener#started()");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("springboot:MySpringApplicationRunListener#running()");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("springboot:MySpringApplicationRunListener#failed()");
    }
}
