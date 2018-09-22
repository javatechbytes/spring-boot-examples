package com.spring.activemq.springactivemqdemo.rest;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener(destination = "demo.queue")
	public void listener(String message) {
		System.out.println("Received: " + message);
	}
}
