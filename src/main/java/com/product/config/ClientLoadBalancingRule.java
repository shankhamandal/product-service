package com.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ClientLoadBalancingRule {

	@Bean
	public IRule randomRule() {
		return new RandomRule();
	}

}
