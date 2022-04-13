package com.example.jcasbin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class AuthzApplication {

    public static void main(String[] args) {
        EnforcerFactory enforcerFactory = SpringApplication.run(AuthzApplication.class, args)
        .getBean(EnforcerFactory.class);
        enforcerFactory.addPolicy(new Policy("alice", "/test", "GET"));
    }

}
