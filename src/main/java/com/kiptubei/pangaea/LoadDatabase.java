/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiptubei.pangaea;

/**
 *
 * @author mkiptubei
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(SubscriberRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Subscriber("http://localhost:9000/test1")));
      log.info("Preloading " + repository.save(new Subscriber("http://localhost:9000/test2")));
    };
  }
  
  @Bean
  CommandLineRunner initDatabase2(PublishRepository repository2) {

    return args -> {
      log.info("Preloading " + repository2.save(new Publish("Nice to be here")));
    };
  }
    
}
