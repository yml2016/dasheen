package com.dasheen.common.startup;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class MyApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        System.out.println("springboot:MyApplicationContextInitializer#initialize()"+applicationContext.getId());
    }
}
