package com.dasheen.common.config;

import com.dasheen.common.exception.RRExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {DasheenConfiguration.class, RRExceptionHandler.class/*,MybatisPlusConfig.class*/})
public class DasheenAutoConfiguration {
}
