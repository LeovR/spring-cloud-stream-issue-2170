package com.example.springcloudstreamissue2170;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class StreamConfiguration {

    @Bean
    public Supplier<Void> arbitraryFunctionalBean() {
        return () -> null;
    }

    // Enable this to make the configuration work
    //    @Bean
    public Supplier<Void> secondaryBean() {
        return () -> null;
    }

}
