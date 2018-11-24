package com.han.cloud.controller;

import com.han.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName MovieController
 * @Description TODO
 * @Author hanyf
 * @Date 2018\11\4 0004 15:06
 * @Version 1.0
 **/
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("http://localhost:7900/simple/")
    private String userSerrvicePath;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        User forObject = this.restTemplate.getForObject(userSerrvicePath + id, User.class);
        return forObject;
    }
}
