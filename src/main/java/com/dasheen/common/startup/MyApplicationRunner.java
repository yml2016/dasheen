package com.dasheen.common.startup;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE+10)
public class MyApplicationRunner implements ApplicationRunner, CommandLineRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("执行ApplicationRunner#run方法，args->"+Arrays.asList(args.getSourceArgs()));
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("执行CommandLineRunner#run方法，args->"+ Arrays.asList(args));
    }

}
