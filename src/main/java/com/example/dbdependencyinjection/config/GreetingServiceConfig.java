package com.example.dbdependencyinjection.config;

import com.example.dbdependencyinjection.repository.EnglishGreetingRepo;
import com.example.dbdependencyinjection.repository.EnglishGreetingRepoImpl;
import com.example.dbdependencyinjection.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;


@Configuration
public class GreetingServiceConfig {
    @Profile({"SP", "default"})
    @Bean("i18Service")
    I18SpanishGreetingService i18SpanishGreetingService() {
        return new I18SpanishGreetingService();
    }

    @Bean
    EnglishGreetingRepo englishGreetingRepo() {
        return new EnglishGreetingRepoImpl();
    }

    @Profile({"EN"})
    @Bean
    I18EnglishGreetingService i18Service(EnglishGreetingRepo englishGreetingRepo) {
        return new I18EnglishGreetingService(englishGreetingRepo);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

}
