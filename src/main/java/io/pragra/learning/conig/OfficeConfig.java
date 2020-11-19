package io.pragra.learning.conig;

import io.pragra.learning.OfficeAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OfficeConfig {

    @Bean
    public OfficeAddress oa(){
        return new OfficeAddress();
    }
}
