/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiptubei.pangaea;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author mkiptubei
 */
@RestController
class SubscriberController {
      private final SubscriberRepository repository;

  SubscriberController(SubscriberRepository repository) {
    this.repository = repository;
  }
  
    @PostMapping("/subscribe/{topic}")
  Subscriber setSubscriber(@RequestBody Subscriber newSubscriber, @PathVariable String topic) {
    
        newSubscriber.setTopic(topic);
        return repository.save(newSubscriber);
   
  }
  

  
  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/subscribers")
  List<Subscriber> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

}
