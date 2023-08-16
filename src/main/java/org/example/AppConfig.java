package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example") //another method this could scan all components in the package
public class AppConfig {
    // if we do not want to use @Bean ,yet we still want to have the same result we use another method
//    @Bean
//    public Samsung getPhone(){
//        return new Samsung();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor(){
//        return new Snapdragon();
//    }

}
