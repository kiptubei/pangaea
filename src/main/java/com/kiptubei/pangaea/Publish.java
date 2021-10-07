
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
class Publish {

    private @Id
    @GeneratedValue
    Long id;
    private String message;
    private String topic;

    Publish() {
    }

    Publish(String message, String topic) {

        this.message = message;
        this.topic = topic;
    }

    Publish(String message) {
        this.message = message;
    }

    public Long getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof Publish)) {
            return false;
        }
        Publish published = (Publish) o;
        return Objects.equals(this.id, published.id) && Objects.equals(this.message, published.message)
                && Objects.equals(this.topic, published.topic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.message, this.topic);
    }

    @Override
    public String toString() {
        return "Publish{" + "id=" + this.id + ", message='" + this.message + '\'' + ", topic='" + this.topic + '\'' + '}';
    }

}
