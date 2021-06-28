package com.example.demo;

import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.boot.context.properties.bind.Name;

@ConfigurationProperties("wait")
@ConstructorBinding
public class WaitProperties {
	
	private Duration forTime;
	
	public WaitProperties(@DefaultValue("0") @Name("for") Duration forTime) {
		this.forTime = forTime;
	}

	public Duration forTime() {
		return forTime;
	}

}
