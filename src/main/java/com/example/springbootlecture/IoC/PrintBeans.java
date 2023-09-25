package com.example.springbootlecture.IoC;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PrintBeans {
    private final ApplicationContext applicationContext;
//    @Bean
//    public void printBeanNames(){
//        List<String> beanNames = Arrays.stream(applicationContext.getBeanDefinitionNames()).toList();
//        beanNames.forEach(System.out::println);
//        System.out.println("Hello World");
//    }
}
