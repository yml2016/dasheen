package com.dasheen.common.startup;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("springboot:MyApplicationListener#onApplicationEvent()"+event.getTimestamp());
    }
}
