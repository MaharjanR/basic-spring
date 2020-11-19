package io.pragra.learning.conig;

import io.pragra.learning.HomeAddress;
import io.pragra.learning.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HomeAddress homeAddress(){
        return new HomeAddress("Sadd", 23, "Kitchener", "Canada");
    }

    @Bean(initMethod = "init")
    public Person person(){
        return new Person("Ritesh", 12, homeAddress(), null );
    }

    @Bean
    public Person person2(){
        return new Person("Bipash", 12, homeAddress(), null );
    }
}
