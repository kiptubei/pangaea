/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kiptubei.pangaea;

/**
 *
 * @author mkiptubei
 */
import org.springframework.data.jpa.repository.JpaRepository;

interface SubscriberRepository extends JpaRepository<Subscriber, Long> {
    
}
