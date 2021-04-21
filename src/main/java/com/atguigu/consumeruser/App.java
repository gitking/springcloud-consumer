package com.atguigu.consumeruser;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *springcloud-consumer这个项目时消费者项目,所以需要发现eureka-server注册中心里面有哪些服务
 */
@EnableDiscoveryClient//开启发现服务功能
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    @LoadBalanced//发送http请求的时候启用负载均衡机制
    @Bean
    public RestTemplate restTemplate() {
    	//RestTemplate是帮我们发送http请求的
    	return new RestTemplate();
    }
}
