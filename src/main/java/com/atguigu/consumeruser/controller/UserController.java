package com.atguigu.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/buy")
	public String buyTicket(String name) {
		//http://PROVIDER-TICKET/ticket的意思是请求Eureka注册中心上面的PROVIDER-TICKET服务里面的ticket请求
		String ticket = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
		return name + "购买了" + ticket;
	}
}
