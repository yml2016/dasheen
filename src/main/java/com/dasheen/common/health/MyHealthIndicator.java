package com.dasheen.common.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator extends AbstractHealthIndicator {


    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        //获取需要监控的信息进行判断
        boolean health= true;
        if(health){
            builder.up();
            builder.withDetail("msg","成功");
        }
        else {
            builder.down();
            builder.withDetail("msg","失败");
        }

    }

}