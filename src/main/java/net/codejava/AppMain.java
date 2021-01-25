package net.codejava;

import java.time.Duration;

import org.apache.http.impl.client.CloseableHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AppMain {
	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}
	/*
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	 
	    return builder
	            .setConnectTimeout(Duration.ofMillis(3000))
	            .setReadTimeout(Duration.ofMillis(3000))
	            .build();
	}
	
	@Autowired
	CloseableHttpClient httpClient;
	 
	@Bean
	public RestTemplate restTemplate() {
	 
	    RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory());
	    return restTemplate;
	}
	 
	@Bean
	public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory() {
	 
	    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory 
	                            = new HttpComponentsClientHttpRequestFactory();
	    clientHttpRequestFactory.setHttpClient(httpClient);
	    return clientHttpRequestFactory;
	}
	*/
}
