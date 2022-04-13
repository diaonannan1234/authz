package com.example.jcasbin;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author : yx-0176
 * @description
 * @date : 2021/1/20
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "org.jcasbin")
public class EnforcerConfigProperties {

    private String url;

    private String driverClassName;

    private String username;

    private String password;

}
