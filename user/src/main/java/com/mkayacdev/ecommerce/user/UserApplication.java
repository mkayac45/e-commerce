package com.mkayacdev.ecommerce.user;

import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args){ SpringApplication.run(User.class,args); }
}
