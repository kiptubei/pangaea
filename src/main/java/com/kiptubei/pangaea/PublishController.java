/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiptubei.pangaea;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author mkiptubei
 */
@RestController
class PublishController {
      private final PublishRepository repository2;

  PublishController(PublishRepository repository) {
    this.repository2 = repository;
  }
  
    @PostMapping("/publish/{topic}")
  Publish setPublish(@RequestBody Publish newPublish, @PathVariable String topic) {
    
        newPublish.setTopic(topic);
        return repository2.save(newPublish);
   
  }
  
    	@GetMapping("/publish/{topic}")
	public ResponseEntity<List<Publish>> getPublishByTopic(@PathVariable String topic) {
		return new ResponseEntity<>(repository2.findByTopic(topic), HttpStatus.OK);
  
	}
        
        	@GetMapping("/publisher/{topic}")
	public Publish getLast(@PathVariable String topic) {
		return repository2.findFirstByOrderByIdDesc();
  
	}
  
  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/published")
  List<Publish> all() {
    return repository2.findAll();
  }
  // end::get-aggregate-root[]
  

}
