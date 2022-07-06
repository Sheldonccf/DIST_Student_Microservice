package com.in28minutes.microservices.testservice;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "data")

public class Configuration {

    private String env;

//    @Value("${data.user.username}")
    private String username;

//    @Value("${data.user.password}")
    private String password;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //    private int maximum;
//
//    private int minimum;
//
//    public int getMaximum() {
//        return maximum;
//    }
//
//    public void setMaximum(int maximum) {
//        this.maximum = maximum;
//    }
//
//    public int getMinimum() {
//        return minimum;
//    }
//
//    public void setMinimum(int minimum) {
//        this.minimum = minimum;
//    }
}
