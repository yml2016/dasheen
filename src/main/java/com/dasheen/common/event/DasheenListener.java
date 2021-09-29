package com.dasheen.common.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DasheenListener implements ApplicationListener<DasheenEvent> {

    @Override
    public void onApplicationEvent(DasheenEvent event) {
        Object source = event.getSource();
        //可以开启新的线程执行监听到的任务
        System.out.println("例如：ApplicationListener#onApplicationEvent方法->"+source);
    }


}
