package com.dasheen.common.config;

import com.dasheen.common.cycle.Myconfig;
import com.dasheen.common.event.DasheenListener;
import com.dasheen.common.servlet.MyServletConfig;
import com.dasheen.common.startup.MyApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@Import(value = {Myconfig.class, DasheenListener.class, MyServletConfig.class, MyApplicationRunner.class})
public @interface EnableLearning {
}
