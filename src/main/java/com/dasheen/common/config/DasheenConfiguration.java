package com.dasheen.common.config;

import com.dasheen.common.service.ApplicationContextService;
import com.dasheen.common.service.CommonService;
import com.dasheen.common.service.EnvironmentService;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DasheenConfiguration {

    @ConditionalOnMissingBean(ApplicationContextService.class)
    @Bean
    public ApplicationContextService applicationContextService(){
        ApplicationContextService applicationContextService = new ApplicationContextService();
        return applicationContextService;
    }

    @Bean
    @ConditionalOnMissingBean(EnvironmentService.class)
    public EnvironmentService environmentService(){
        EnvironmentService environmentService = new EnvironmentService();
        return environmentService;
    }

    @Bean
    @ConditionalOnMissingBean(CommonService.class)
    public CommonService commonService(MeterRegistry meterRegistry){
        CommonService commonService = new CommonService(meterRegistry);
        return commonService;

    }


}
