package me.leolin;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonHistrixController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/ribbon-hystrix/{id}")
    public User findUserById(@PathVariable Long id) {
        return restTemplate.getForObject("http://user-api/" + id, User.class);
    }

    public User fallback(Long id) {
        return new User(-1L, "fail to get " + id, 0);
    }

}
