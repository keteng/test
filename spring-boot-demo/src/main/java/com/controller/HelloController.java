/**
 * 
 */
package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;
import com.sun.istack.internal.logging.Logger;
@RestController
public class HelloController {
	private final Logger logger = Logger.getLogger(getClass()) ;
	
	@Autowired
	private DiscoveryClient client ;
	@Autowired
	private EurekaClient eclient ;
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String index() {
		ServiceInstance instance = client.getLocalServiceInstance();
		logger.info("/hello ,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
		return "hello world" ;
	}
}
 