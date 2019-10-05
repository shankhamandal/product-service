package com.product.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.product.model.Location;

@FeignClient(name = "location-service")
public interface LocationServiceProxy {

	@GetMapping(path = "/api/v1/location", produces = "application/json")
	Location getLocation();

}
