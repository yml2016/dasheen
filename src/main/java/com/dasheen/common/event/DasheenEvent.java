package com.dasheen.common.event;

import org.springframework.context.ApplicationEvent;

public class DasheenEvent extends ApplicationEvent {

    public DasheenEvent(Object source) {
        super(source);
    }
}
