package com.dasheen.common.service;


import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonService {

    //统计指标
    Counter counter;

    public CommonService(MeterRegistry meterRegistry){
        counter = meterRegistry.counter("service.method.running.counter");
    }

    public void count(){
        counter.increment();
        log.info("counter累加+1");
    }
}
