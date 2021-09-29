package com.dasheen.common.cycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Bean的生命周期show
 */
@Configuration
public class Myconfig {

    @Bean(initMethod="initMethod",destroyMethod = "destroyMethod")
    public MyBean myBean(){
        return new MyBean();
    }

}
