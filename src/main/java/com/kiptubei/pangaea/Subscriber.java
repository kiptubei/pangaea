/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiptubei.pangaea;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author mkiptubei
 */
@Entity
public class Subscriber {
    
    private @Id @GeneratedValue Long id;
  private String url;
  private String topic;

  Subscriber() {}

  Subscriber(String url, String topic) {

    this.url = url;
    this.topic = topic;
  }
  
    Subscriber(String url) {
    this.url = url;
  }
  
   public Long getId() {
    return this.id;
  }

  public String getUrl() {
    return this.url;
  }

  public String getTopic() {
    return this.topic;
  }
  
  public void setId(Long id) {
    this.id = id;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Subscriber))
      return false;
    Subscriber subscriber = (Subscriber) o;
    return Objects.equals(this.id, subscriber.id) && Objects.equals(this.url, subscriber.url)
        && Objects.equals(this.topic, subscriber.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.url, this.topic);
  }

  @Override
  public String toString() {
    return "Subscriber{" + "id=" + this.id + ", url='" + this.url + '\'' + ", topic='" + this.topic + '\'' + '}';
  }

    
}
