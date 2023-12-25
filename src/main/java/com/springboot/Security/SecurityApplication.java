package com.springboot.Security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecurityApplication{

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);	}

//	@Override
//	public void run(String... args) throws Exception {
//
////		PasswordEncoder encoder=new BCryptPasswordEncoder();
////		System.out.println(encoder.encode("rohit@123"));
////		System.out.println(encoder.encode("pankaj@123"));
////		System.out.println(encoder.encode("janam@123"));
//	}
}
