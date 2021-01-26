package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
