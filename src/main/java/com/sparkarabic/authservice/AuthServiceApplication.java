package com.sparkarabic.authservice;

import com.sparkarabic.authservice.domain.User;
import com.sparkarabic.authservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.stereotype.Repository;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration

@EnableMongoRepositories("com.sparkarabic.authservice.repository")

//@EnableJpaRepositories(basePackages = {"com.sparkarabic.authservice.repository"})
public class AuthServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
//		userRepository.deleteAll();
//
//		User user = new User();
//		user.setUsername("mumtaz");
//		user.setPassword("khan");
//		user.setActivated(true);
//		Authority authority = new Authority();
//		user.setAuthorities();
//		userRepository
	}
}
